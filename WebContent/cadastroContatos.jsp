<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fnc" %>

<html>
<head>

</head>
<body>
	
	<hgroup>
		<h2>Cadastro de Contatos:</h2>
	</hgroup>

	<div>
		
		<form method="post" action="ControlePessoa?acao=cadastrar">
			
			<div>
			
				<fieldset>
			
					<h4>Dados Gerais:</h4>
					<hr>
			
					<label>Nome do Cliente:
						<input style="width: 350px" type="text" name="nome" placeholder="Digite aqui" />
					</label>
					<br/><br/>
						
					<label>Telefone:
						<input style="width: 200px" type="text" name="telefone" placeholder="Digite aqui"/>
					</label>
					<br/><br/>
				
					<label>Email:
						<input style="width: 250px" type="text" name="email" placeholder="Digite aqui"/>
					</label>
					<br/><br/>
							
					<label>Data Nasc.:
						<input style="width: 200px" type="date" name="datanasc" class="form-control" placeholder="Digite aqui"/>
					</label>
					<br/><br/><hr>
							
					<input type="submit" value="Cadastrar"/>
					
				</fieldset>
						
			</div>
		</form>			
	</div>
</body>
</html>	
		
	