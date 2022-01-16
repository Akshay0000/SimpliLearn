package com.simplilearn;

public class Main {

	public static void main(String[] args) {
		
		// Create "main" folder if not present in current folder structure
		PerformFileOperations_001.createMainFolderIfNotPresent("main");
		
		MenuOptions_01.printWelcomeScreen("InitializingProject", "AKSHAY X");
		
		TackelOptions.handleWelcomeScreenInput();
	}

	
}