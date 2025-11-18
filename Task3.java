package com.filehandling;

import java.io.*;

public class Task3 {
	public static void main(String[] args) throws IOException {
		try (
	            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	            BufferedWriter bw = new BufferedWriter(new FileWriter("src/com/filehandling/notes.txt"))
	        ) {
	            System.out.println("Enter your text:");
	            String input = br.readLine();
	            bw.write(input);
	        } 
	        catch (IOException e) {
	            System.out.println(e.getMessage());
	        } 
	        finally {
	            System.out.println("Execution completed");
	        }
	}

}
