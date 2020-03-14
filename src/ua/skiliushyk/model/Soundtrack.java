package ua.skiliushyk.model;

import java.io.Serializable;

import ua.skiliushyk.Constants;

public class Soundtrack implements Serializable {
	private static final long serialVersionUID = 7987572486508574055L;
	String pathToFile;
	String trackTitle;
	String trackId;
	//String trackPerformer;

	public Soundtrack() {
		super();
	}

//	public Soundtrack(String path, String name) {
//		this.pathToFile = path;
//		this.trackName = name;
//	}

	public String getPathToFile() {
		return this.pathToFile;
	}
	
	public void setPathToFile(String trackTitle) {
		this.pathToFile = Constants.FOLDER + trackTitle;
	}
	
	public String getTrackTitle() {
		return this.trackTitle;
	}
	
	public void setTrackTitle(String trackTitle) {
		this.trackTitle = trackTitle;
	}

//	public String getTrackName() {
//		return this.trackName;
//	}

//	public void setTrackName(String name) {
//		this.trackName = name;
//	}
	
	public Soundtrack soundtrackFinder(int soundtrackNumber) {
		for(int i = 0; i < Constants.SOUNDTRACKS.length; i++) {
			if (i == soundtrackNumber) {
				this.setPathToFile(Constants.SOUNDTRACKS[i]);
				return this;
			}
		}
		return null;
	} 

	public String toString() {
		return "Soundtrack: " + " - " + this.pathToFile;
	}
}
