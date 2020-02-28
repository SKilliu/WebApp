<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Enjoy the music</title>
<link href="/WebApp/pages/styles/music_page.css" rel="stylesheet">
</head>
<body>
	<div>
		<form method="post">
			<input type="radio" name="nxt" value="clears">Clear Bandit<br>
			<input type="radio" name="nxt" value="finding">Nominal<br>
			<input type="submit" value="Choose track">
		</form>
		<br>
		<br>
		<b>Now playing: </b>${currentTrack}<br>
		<audio controls>
			<source src="${filePath}" type="audio/mpeg">
		</audio>
		<br>
		<br> <a href="/WebApp"><b>To main page</b></a>
	</div>
</body>
</html>