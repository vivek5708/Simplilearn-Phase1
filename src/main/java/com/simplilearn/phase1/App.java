package com.simplilearn.phase1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App 
{
	
    public static void main( String[] args )
    {
    	System.out.println("******************************************************");
    	System.out.println( "Welcome to LockedMe.com" );
        System.out.println("This application is developed by Vivek Kumar Anand");
        System.out.println("******************************************************");
        System.out.println();
        Scanner scanerObj = new Scanner(System.in);
        mainMenu(scanerObj);
        scanerObj.close();
    }

	public static void mainMenu(Scanner scanerObj) {
		
        System.out.println("Please choose any one of the following options");
        System.out.println("1. List all the Files");
        System.out.println("2. Add, Delete, Search any File");
        System.out.println("3. Exit");
        try {
        	String strOptionInput =  scanerObj.nextLine();
        	int optionInput = Integer.parseInt(strOptionInput);
        	if(optionInput == 1) {
            	System.out.println("Following are the list of Files");
            	ReadFile readFileObj = new ReadFile();
            	readFileObj.readFiles();
            	goBackToMainMenu(scanerObj);
            		
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
            	mainMenu(scanerObj);
            }
            
        }
        catch(InputMismatchException e) {
        	System.out.println("Please enter the option number.");
        	mainMenu(scanerObj);
        }
        catch (NumberFormatException e) {
			// TODO: handle exception
        	System.out.println("Please enter the option number.");
        	mainMenu(scanerObj);
        	
		}
        
	}

	public static void goBackToMainMenu(Scanner scanerObj) {
		
		System.out.println("Would you like to go back to main menu?(Y/N)");
    	System.out.println("**Note - Selecting 'No' will exit you from the application");
		
		String stringInput = scanerObj.nextLine();
		if(stringInput.matches("y") || stringInput.matches("Y") || stringInput.toLowerCase().equals("yes")) {
			mainMenu(scanerObj);
		}
		else if(stringInput.matches("n") || stringInput.matches("N") ||stringInput.toLowerCase().equals("no")) {
			System.out.println("Exiting from the application.....");
			System.exit(0);
		}
		else {
			System.out.println("please enter Yes(Y/y) or No(N/n)");
			goBackToMainMenu(scanerObj);
		}
		
	}

	public static void subMenu(Scanner scanerObj) {
		System.out.println("Please select any one of the following option");
		System.out.println("1. Add any file");
		System.out.println("2. Delete any file");
		System.out.println("3. Search any file");
		System.out.println("4. Go Back to main menu");
		
		
		try {
			String strOptionInput1 =  scanerObj.nextLine();
			int optionInput1 = Integer.parseInt(strOptionInput1);
			if(optionInput1 == 1) {
				AddFile addNewFileObj =  new AddFile();
				addNewFileObj.addNewFile(scanerObj);
				
				goBackToSubMenu(scanerObj);
			}
			else if(optionInput1 == 2) {
				DeleteFile deleteFileObj = new DeleteFile();
				deleteFileObj.deleteFile(scanerObj);
				
				goBackToSubMenu(scanerObj);
			}
			else if(optionInput1 == 3) {
				SearchFile searchFileObj = new SearchFile();
				String result = searchFileObj.searchFile(scanerObj);
				System.out.println(result);
				
				goBackToSubMenu(scanerObj);
				
			}
			else if(optionInput1 == 4) {
				mainMenu(scanerObj);
			}
			else {
				System.out.println("Invalid Option. Please input a valid Option.");
				subMenu(scanerObj);
			}
			
		}
		catch(InputMismatchException e) {
        	System.out.println("Please enter the option number.");
        	subMenu(scanerObj);
        }
	}
	public static void goBackToSubMenu(Scanner scanerObj) {
		System.out.println("Would you like to go back to sub menu?(Y/N)");
		System.out.println("**Note - Selecting 'No' will exit you from the application");
		String stringInput = scanerObj.nextLine();
		if(stringInput.matches("y") || stringInput.matches("Y") || stringInput.toLowerCase().equals("yes")) {
			subMenu(scanerObj);
		}
		else if(stringInput.matches("n") || stringInput.matches("N") ||stringInput.toLowerCase().equals("no")) {
			System.out.println("Exiting from the application.....");
			System.exit(0);
		}
		else {
			System.out.println("please enter Yes(Y/y) or No(N/n)");
			goBackToSubMenu(scanerObj);
		}
	}
}
