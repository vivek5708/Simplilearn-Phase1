package com.simplilearn.phase1;

import java.io.File;

public class ReadFile {
	
		public void readFiles() {
			File file = new File("D:\\Simplilearn Assessment");
			File[] files =  file.listFiles();
			System.out.println("No. of Files: "+ files.length);
			for(File eachfile: files) {
				if(eachfile.isDirectory()) {
					File[] folderFiles = eachfile.listFiles();
					for(File eachFolderFiles: folderFiles) {
						System.out.println(eachFolderFiles.getName());
					}
				}
				System.out.println(eachfile.getName());
			}
		}
}
