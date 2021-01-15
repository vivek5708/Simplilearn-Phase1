package com.simplilearn.phase1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AddFile {
	
	public void addNewFile() {
		Scanner scanerObj1 = new Scanner(System.in);
		System.out.println("Please enter the new file name to be added:");
		String newFile = scanerObj1.nextLine();
		String rootDirectory = "D:\\Simplilearn Assessment\\";
		File file = new File(rootDirectory,newFile);
		try {
			if(file.createNewFile()) {
				System.out.println("File Created!!");
			}
			else {
				System.out.println("File Already Exist");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Icorrect File Path!!");
			e.printStackTrace();
		}
		scanerObj1.close();
	}

}
