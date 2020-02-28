<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Enjoy the music</title>
</head>
<body>
	<form method="post">
		<input type="radio" name="nxt" value="clears">Clear Bandit<br>
		<input type="radio" name="nxt" value="finding">Nominal<br>
		<input type="submit" value="Навалить музла">
	</form>

	<p>Clean Bandit - Dust Clears</p>
	<audio controls>
		<source src="${filePath}" type="audio/mpeg">
	</audio>
	<br>
	<b>Now playing: </b>${currentTrack}<br><br>
	
	<a href="/WebApp"><b>To main page</b></a>
</body>
</html>