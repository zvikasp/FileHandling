package simplilearn.java;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateNewFile {

	public static void main(String[] args) throws IOException {
		createFileUsingFileClass();
		createFileUsingFileOutputStreamClass();
		createFileIn_NIO();
	}

	private static void createFileUsingFileClass() throws IOException {
		File file = new File("D://Full_Stack_SimpliLearn//testFile1.txt");
		
		// Create the file
		if (file.createNewFile())
			System.out.println("File is created!");
		else
			System.out.println("File already exists");
		
		// Write content
		FileWriter writer = new FileWriter(file);
		writer.write("Test data");
		writer.close();
	}

	private static void createFileUsingFileOutputStreamClass() {
		// TODO Auto-generated method stub
		
	}
	
	private static void createFileIn_NIO() {
		// TODO Auto-generated method stub
		
	}

}
