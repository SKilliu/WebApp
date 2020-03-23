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
	 
	<div id="playlist">
	<p>Your playlist</p>
		<form name="player" method="post">
			${userPlaylist}
			<input type="submit" value="Choose track">
		</form>
		<br> <br>
		<b>Now playing: </b>${currentTrack}<br> <br>
		<audio controls>
			<source src="${filePath}" type="audio/mpeg">
		</audio>
		<br> <br>
	</div>

	<div id="songslist">
		<form name="songs_selector" method="post">
			<input type="checkbox" name="0" value="0">Clean Bandit - Dust Clears<br>
			<input type="checkbox" name="1" value="1">David	James Terry - Finding Peace<br>
			<input type="checkbox" name="2"	value="2">Moonbeam feat. Avis Vox - 7 seconds<br>
			<input type="checkbox" name="3"	value="3">Kina - Can We Kiss Forever<br>
			<input type="checkbox" name="4"	value="4">Armin Van Buuren, BT feat. Nation Of One - Always.mp3<br>
			<input type="checkbox" name="5"	value="5">Lana Del Rey - Young and Beautiful (Edmofo Remix).mp3<br>
			<input type="submit" value="Add to my playlist">
		</form>
	</div>
	<br>
	<a href="/WebApp"><b>To main page</b></a>
</body>
</html>