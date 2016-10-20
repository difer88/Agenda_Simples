<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <jsp:useBean class="br.com.agenda.managedbeans.ManagedBeanContato" id="mb"></jsp:useBean>

	<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
	<%@ taglib uri ="http://java.sun.com/jsp/jstl/fmt" prefix ="fmt" %>
	<%@ taglib uri ="http://java.sun.com/jsp/jstl/functions" prefix ="fnc" %>

<html>
<head>

</head>
<body class="container">

	<h3>Lista de Contatos:</h3>

	<div class="row" >
		
		<c:forEach items="${mb.listagemContatos}" var="contato">
			
			<label>ID: </label><strong>${contato.idContato}</strong>
			<br/>	
			<label>Nome: </label><strong>Autor: </strong>${contato.nome}
			<br/>
			<label>Data Nasc: </label><strong>Editora: </strong>${contato.dataNascimento}
			<br/>
			<label>Telefone: </label><strong>Editora: </strong>${contato.telefone}
			<br/>
			<label>E-mail: </label><strong>Editora: </strong>${contato.email}
			<hr>	
				
		</c:forEach>

	</div>
	
	<h3><a href="cadastroContatos.jsp">Cadastrar novo Contato</a></h3>

</body>
</html>