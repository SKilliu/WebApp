package ua.skiliushyk.model;

import java.util.ArrayList;

public class Playlist {
	ArrayList<Soundtrack> userPlaylist = new ArrayList<Soundtrack>();

	public void addTrack(int trackId) {
		Soundtrack soundtrack = new Soundtrack();
		String trackTitle = Soundtrack.trackTitleFinder(trackId);
		soundtrack.setPathToFile(trackTitle);
		userPlaylist.add(soundtrack);
	}

	public String playlistOuter(Playlist playlist) {
		StringBuilder stringToOut = new StringBuilder();
		char dm = (char) 34;
		String startTag = "<input type=" + dm + "radio" + dm + "name=" + dm + playlist + dm + "value=" + dm;
		
		//<input type="radio" name="playlist" value="0">Clean Bandit - Dust Clears<br>
		for (Soundtrack s : userPlaylist) {
			String num = Integer.toString(s.getTrackId()) + dm + ">";
			stringToOut.append(startTag).append(num).append(s.getTrackTitle()).append("<br>");
		}
		return stringToOut.toString();
	}
}
