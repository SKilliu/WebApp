<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="java-classes" uri="/WEB-INF/tags.tld"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Enjoy the music</title>
<link href="/WebApp/pages/styles/music_page.css" rel="stylesheet">
</head>
<body>
	<java-classes:date />
	<br>
	<br>
	<div id="playlist">
		<form name="player" method="post">
			<input type="radio" name="nxt" value="0">Clean Bandit - Dust Clears<br>
			<input type="radio" name="nxt" value="1">David James Terry - Finding Peace<br> 
			<input type="radio" name="nxt" value="2">Moonbeam feat. Avis Vox - 7 seconds<br> 
			<input type="submit" value="Choose track">
		</form>
		<br>
		<br><b>Now playing: </b>${currentTrack}<br>
		<br>
		<audio controls>
			<source src="${filePath}" type="audio/mpeg">
		</audio>
		<br> <br>
	</div>
	<div id="songslist">
		<form name="songs_selector" method="post">
			<input type="checkbox" name="song" value="song1">First_song<br>
			<input type="checkbox" name="song" value="song2">Second_song<br>
			<input type="checkbox" name="song" value="song3">Third_song<br>
			<input type="submit" value="Add to my playlist">
		</form>
	</div>
	<br>
	<a href="/WebApp"><b>To main page</b></a>
</body>
</html>