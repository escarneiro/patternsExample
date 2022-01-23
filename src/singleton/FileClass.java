package singleton;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileClass {
	
	/* Abstração em cima de um arquivo 
	 * 
	 * What if diversas threads tivessem de escrever num mesmo arquivo ?
	 * 
	 * */
	
	private static FileClass instance;
	private static File file;
	BufferedWriter writer; 
	
	private FileClass() throws IOException {
		
		file = new File("tmpfile.txt");
		writer = new BufferedWriter(new FileWriter(file, true));
	}
	
	public static FileClass getInstance() throws IOException  {
		if (file==null) 
			instance=new FileClass();
			
		return instance;
		
	}
	
	public void writeToFile(String text) {
		try {
			writer.write(text);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void closeFile() {
		try {
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
