package com.filehandling;

import java.io.*;

public class Task2 {
	public static void main(String[] args) throws IOException {
		try(BufferedWriter bw= new BufferedWriter(new FileWriter("src/com/filehandling/output.txt"))){
			bw.write("Welcome to Java\n BufferedWriter Example\n");
		}catch(IOException e) {
			System.out.println(e.getMessage());
			
		}finally {
			System.out.println("Execution completed");
		}
	}

}
