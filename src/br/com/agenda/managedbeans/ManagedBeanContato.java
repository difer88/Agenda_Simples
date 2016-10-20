package br.com.agenda.managedbeans;

import java.util.List;

import br.com.agenda.entities.Contato;
import br.com.agenda.persistence.ContatoDAO;

public class ManagedBeanContato {
	
	private List<Contato> listagemContatos;
	
	public List<Contato> getListagemContatos(){
		
		try{
			
			ContatoDAO c = new ContatoDAO();
			
			listagemContatos = c.listAll();
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return listagemContatos;
	}

}