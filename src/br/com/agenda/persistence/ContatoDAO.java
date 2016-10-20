package br.com.agenda.persistence;

import java.util.ArrayList;
import java.util.List;

import br.com.agenda.entities.Contato;

public class ContatoDAO extends DAO{
	
	
	public void insert(Contato contato) throws Exception {

		String query = "insert into Contato(nome, data_nascimento, telefone, email, data_hora)VALUES(?,?,?,?,datetime('now'))";

		abreConexao();

		stmt = con.prepareStatement(query);

		stmt.setString(1, contato.getNome());
		stmt.setString(2, contato.getDataNascimento());
		stmt.setString(3, contato.getTelefone());
		stmt.setString(4, contato.getEmail());

		stmt.execute();

		stmt.close();

		fechaConexao();

	}
	
	public List<Contato> listAll() throws Exception{
		
		String query = "select * from contato";
		
		abreConexao();
		
		stmt = con.prepareStatement(query);
		
		rs = stmt.executeQuery();
		
		List<Contato> lista = new ArrayList<Contato>();
		
		while(rs.next()){
			
			Contato contato = new Contato();
			
			contato.setIdContato(rs.getInt("id_contato"));
			contato.setNome(rs.getString("nome"));
			contato.setDataNascimento(rs.getString("data_nascimento"));
			contato.setTelefone(rs.getString("telefone"));
			contato.setEmail(rs.getString("email"));
			
			lista.add(contato);
			
		}
		
		stmt.close();
		
		fechaConexao();
		
		return lista;
		
	}

}
