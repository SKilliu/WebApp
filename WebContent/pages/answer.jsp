<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<title>Question One</title>
</head>
<body>

	<form method="post">
		<p>
			<b>What is the best Italian Team?</b>
		</p>
		<p>
			<input type="radio" name="answer" value="juva">Juventus<br>
			<input type="radio" name="answer" value="inter">Inter<br>
			<input type="radio" name="answer" value="roma">Roma
		</p>
		<p>
			<input type="submit">
		</p>
	</form>
	<b>${userAnswer}</b>
	<br>
	<br>
	<a href="/WebApp"><b>To main page</b></a>
</body>
</html>