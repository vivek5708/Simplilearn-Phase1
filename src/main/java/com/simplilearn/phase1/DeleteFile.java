package com.simplilearn.phase1;

import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class DeleteFile {
	public void deleteFile() {
		Scanner scannerObj = new Scanner(System.in);
		System.out.println("Enter the File name to be deleted:");
		String fileName =  scannerObj.nextLine();
		scannerObj.close();
		String directoryPath = "D:\\Simplilearn Assessment\\"+fileName;
		Path path = Paths.get(directoryPath);
		try {
			Files.delete(path);
			System.out.println("File successfully deleted!!");
		}
		catch (NoSuchFileException e1) {
			System.out.println("There is no file named "+fileName);
			e1.printStackTrace();
		}
		catch (DirectoryNotEmptyException e2) {
			System.out.println("The Drectory is not empty!!");
			e2.printStackTrace();
		}
		catch (IOException e3) {
			e3.printStackTrace();
		}
	}
}
