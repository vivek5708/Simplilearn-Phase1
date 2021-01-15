package com.simplilearn.phase1;

import java.util.Scanner;

public class App 
{
	
    public static void main( String[] args )
    {
    	System.out.println( "Welcome to LockedMe.com" );
        System.out.println("This application is developed by Vivek Kumar Anand");
        mainMenu();
    }

	public static void mainMenu() {
		
        System.out.println("Please choose any one of the following options");
        System.out.println("1. List all the Files");
        System.out.println("2. Add, Delete, Search any File");
        System.out.println("3. Exit");
        Scanner scanerObj = new Scanner(System.in);
        int optionInput =  scanerObj.nextInt();
        if(optionInput == 1) {
        	System.out.println("Following are the list of Files");
        	ReadFile readFileObj = new ReadFile();
        	readFileObj.readFiles();
        }
        else if(optionInput == 2) {
        	subMenu(scanerObj);
        }
        else if(optionInput == 3) {
        	System.out.println("Exiting from the application");
        	System.exit(0);
        }
        else {
        	System.out.println("invalid option. Please enter a valid option from the list");
        }
        scanerObj.close();
	}

	public static void subMenu(Scanner scanerObj) {
		System.out.println("Please select any one of the following option");
		System.out.println("1. Add any file");
		System.out.println("2. Delete any file");
		System.out.println("3. Search any file");
		System.out.println("4. Go Back to main menu");
		int optionInput1 =  scanerObj.nextInt();
		if(optionInput1 == 1) {
			AddFile addNewFileObj =  new AddFile();
			addNewFileObj.addNewFile();
		}
		else if(optionInput1 == 2) {
			DeleteFile deleteFileObj = new DeleteFile();
			deleteFileObj.deleteFile();
		}
		else if(optionInput1 == 3) {
			SearchFile searchFileObj = new SearchFile();
			String result = searchFileObj.searchFile();
			System.out.println(result);
		}
		else if(optionInput1 == 4) {
			mainMenu();
		}
		else {
			System.out.println("Invalid Option. Please input a valid Option.");
		}
	}
}
