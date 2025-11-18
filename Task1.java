package com.filehandling;


import java.io.*;
public class Task1 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		try(BufferedReader br=new BufferedReader(new FileReader("src/com/filehandling/input.txt"))){
			int ans;
			while((ans=br.read())!=-1) {
				System.out.print((char)ans);
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
			
		}finally {
			System.out.println("Execution completed");
		}
				
		
	}

}
