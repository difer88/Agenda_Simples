package br.com.agenda.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.agenda.entities.Contato;
import br.com.agenda.persistence.ContatoDAO;


@WebServlet("/ControlePessoa")
public class ControlePessoa extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ControlePessoa() {
		super();
	}

	protected void execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String acao = request.getParameter("acao");
		
		if (acao != null) {

			if (acao.equalsIgnoreCase("cadastrar")) {

				try {

					Contato contato = new Contato();

					contato.setNome(request.getParameter("nome"));
					contato.setTelefone(request.getParameter("telefone"));
					contato.setEmail(request.getParameter("email"));
					contato.setDataNascimento(request.getParameter("datanasc"));

					ContatoDAO contatoDao = new ContatoDAO();

					contatoDao.insert(contato);
					
				} catch (Exception e) {

					e.printStackTrace();

				} finally {

					request.getRequestDispatcher("index.jsp").forward(request, response);

				}

			}
			
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		execute(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		execute(request, response);
	}

}
