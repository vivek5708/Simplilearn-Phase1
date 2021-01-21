package com.simplilearn.phase1;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReadFile {
	
		public void readFiles() {
			File file = new File("D:\\Simplilearn Assessment");
			File[] files =  file.listFiles();
			List<String> sortedFiles =  new ArrayList<String>();
			System.out.println("No. of Files: "+ files.length);
			for(File eachfile: files) {
				if(eachfile.isDirectory()) {
					File[] folderFiles = eachfile.listFiles();
					for(File eachFolderFiles: folderFiles) {
						sortedFiles.add(eachFolderFiles.getName());
					}
				}
				sortedFiles.add(eachfile.getName());
			}
			Collections.sort(sortedFiles);
			for(String files1: sortedFiles) {
				System.out.println(files1);
			}
		}
}
