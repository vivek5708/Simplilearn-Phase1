package com.simplilearn.phase1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchFile {
	
		public String searchFile(Scanner scanerObj) {
			File file = new File("D:\\Simplilearn Assessment");
			File[] files =  file.listFiles();
			
			List<String> fileList = new ArrayList<String>();
			for(File eachfile: files) {
				String str1 = eachfile.getName();
				fileList.add(str1);
			}
			System.out.println("Enter the file name to search:");
			String inputFile = scanerObj.nextLine();
			
			for(int i=0;i<fileList.size();i++) {
				if(inputFile.equals(fileList.get(i))) {
					return("File found!!");
				}
				else {
					continue;
				}
			}
			return("File Not found!!");
		}
}
