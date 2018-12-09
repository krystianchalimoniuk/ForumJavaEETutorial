<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Forum</title>
</head>
<body>
<form method="post">
<p>Wprowadz tytuł tematu: </p>
<input type="text" name="tytul" maxlength="255"/>
<p>Wprowadz tresc tematu: </p>
<textarea name="tresc" cols="40" rows="9"></textarea><br/>
<input type="submit" value="Dodaj"/>
</form>
</body>
</html>