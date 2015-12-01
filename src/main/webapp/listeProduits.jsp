<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="liste" class="java.util.ArrayList" scope="request"/>


	<table>
	
	<tr>
			<th>Name</th>
			<th>Quantite</th>
	</tr>
	
	<c:forEach items="${produits}" var="produit">
		<tr>
			<td><c:out value="${produit.name}"/></td>
			<td><c:out value="${produit.quantite}"/></td>
		</tr>
		
		
	</c:forEach>
		
	</table>
	
</body>
</html>