package ua.skiliushyk.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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
		for( )
		return stringToOut.toString();
	}
}
