package com.in28minutes.java.oops.cohesion.solution;

//This is a better way of approaching the problem. Different classes have their
//own responsibilities.

class InternetDownloader {

	public void downloadFromInternet() {
	}
}

class DataParser {

	public void parseData(String content) {
	}
}

class DatabaseStorer {

	public void storeIntoDatabase(String data) {
	}
}

class DownloadAndStore {

	// The  responsibilities should be cohesive //
	// i.e the dependency should be explicitly specified. //

	void doEverything() {
		new InternetDownloader().downloadFromInternet();
		new DataParser().parseData("");
		new DatabaseStorer().storeIntoDatabase("");
	}

}

public class CohesionExampleSolution {
}
