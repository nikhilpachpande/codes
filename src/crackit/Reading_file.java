package crackit;

import java.io.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Reading_file {
	
	public static void main(String[] args) throws IOException {
		
		// create and write a file;
		
	   FileWriter fw = new FileWriter("text.txt",true);

	   
	   BufferedWriter writer = new BufferedWriter(fw);
	   
	   
	   writer.write("line 3");
	   writer.newLine();
	   writer.write("line 5");
	   writer.newLine();
	   writer.close();
	   
		
		
		String path="text.txt";
		File file = new File(path);
		
		FileReader fr = new FileReader(file);
		
		BufferedReader bf = new BufferedReader(fr);
		StringBuffer sb = new StringBuffer();
		
		String line;
		
		while((line=bf.readLine()) !=null) {
			
			sb.append(line).append(" ");
			
		
			
			
			 
			 
		}
		String fileContent= sb.toString().trim();
		String[] arr =fileContent.split("  ");
		
		fr.close();
		
		System.out.println(Arrays.toString(arr));
		
		
	}

}
