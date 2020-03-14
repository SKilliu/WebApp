package ua.skiliushyk.model;

import java.util.HashMap;
import java.util.Map;

public class Playlist {
	Map<Integer, Soundtrack> userPlaylist = new HashMap<>();
	private int totalCount = 0;
	
	public void addTrack(int trackId, String pathToTrack) {
		Soundtrack soundtrack = new Soundtrack(trackId, pathToTrack);
		userPlaylist.put(trackId, soundtrack);
	}
	
	public String playlistOuter() {
		
	}
}
