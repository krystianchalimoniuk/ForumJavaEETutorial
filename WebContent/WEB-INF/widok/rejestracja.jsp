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
<h1> Rejestracja</h1>
${blad}
<form method="post">
<p> Login: </p>
<input type="text" maxlength="30" name="login"/>
<p>Hasło: </p>
<input type="password" maxlength="20" name="haslo"/>
<p>Powtórz hasło: </p>
<input type="password" maxlength="20" name="haslo2"/><br/>
<input type="submit" value="Zarejestruj"/>
</form>
</body>
</html>