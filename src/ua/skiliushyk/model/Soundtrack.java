package ua.skiliushyk.model;

import java.io.Serializable;

public class Soundtrack implements Serializable{
	private static final long serialVersionUID = 7987572486508574055L;
	String pathToFile;
	String name;
	
	Soundtrack(String path, String name) {
		this.pathToFile = path;
		this.name = name;
	}
}
