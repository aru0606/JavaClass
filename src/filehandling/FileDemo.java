package filehandling;

import java.io.*;


public class FileDemo {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\gomat\\eclipse-workspace\\JavaRockers\\src\\filehandling\\mytxt.txt");
//		
//		if(f.createNewFile()) {
//			System.out.println("File successfully created!!!");
//		}else {
//			System.out.println("File not created!!!");
//		}
		
//		FileWriter fw = new FileWriter("C:\\Users\\gomat\\eclipse-workspace\\JavaRockers\\src\\filehandling\\mytxt.txt",true);
//		
//		fw.write("Welcome");
//		
//		
//		fw.close();
//		
//		System.out.println("File written!!!");
		
		
		FileReader reader = new FileReader("C:\\Users\\gomat\\eclipse-workspace\\JavaRockers\\src\\filehandling\\mytxt.txt");

        int ch;

        while ((ch = reader.read()) != -1) {
            System.out.print((char) ch);
        }

        reader.close();
        
        if (f.delete()) {
            System.out.println("File deleted successfully");
        } else {
            System.out.println("File not found");
        }
		
	}
}
