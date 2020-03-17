package ua.skiliushyk.model;

import java.io.Serializable;

import ua.skiliushyk.Constants;

public class Soundtrack implements Serializable {
	private static final long serialVersionUID = 7987572486508574055L;
	private String pathToFile;
	private String trackTitle;
	private int trackId;
	// String trackPerformer;

	public Soundtrack() {
		super();
	}

	public Soundtrack(int trackId, String trackTitle) {
		super();
		this.trackId = trackId;
		this.trackTitle = trackTitle;
		this.setPathToFile(trackTitle);
	}
	
	public int getTrackId() {
		return this.trackId;
	}
	
	public void setTrackId(int trackId) {
		this.trackId = trackId;
	}

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

	public String toString() {
		return "Soundtrack: " + " - " + this.pathToFile;
	}
}
