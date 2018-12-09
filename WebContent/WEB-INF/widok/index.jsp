<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Forum</title>
</head>
<body>
<h1>FORUM</h1>
<table>
<tr>
<th>Temat</th>
<th>Data</th>
<th>Autor</th>
</tr>
<c:forEach var="temat" items="${tematy}">
<tr>
<td>
<c:url var="url" scope="page" value="/temat">
<c:param name="id" value="${temat.id}"/>
</c:url>
<a href="${url}">${temat.tytul}</a>
</td>
<td><fmt:formatDate value="${temat.data}" dateStyle="short" timeStyle="short" type="both"/></td>
<td>${temat.uzytkownik.login}</td>
<td>
</c:forEach>
</table>
<c:url value="/nowyTemat" var="urlNowyTemat" scope="page"/>
<form action="${urlNowyTemat}">
<input type="submit" value="Nowy temat"/>
</form>
<br/>
<a href="wyloguj">Wyloguj</a>
</body>
</html>