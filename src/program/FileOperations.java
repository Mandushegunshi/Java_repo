package program;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOperations {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		
		try{
			FileOutputStream a=new FileOutputStream("test1.txt");
        String msg="Welcome to Java";
		
		byte myarray[]=msg.getBytes();
		a.write(myarray);
		System.out.println("Sucussful");
		}catch(FileNotFoundException e) {
			System.out.println("Not found file");
		}
		
		System.out.println("file");
		
		

	}

}
