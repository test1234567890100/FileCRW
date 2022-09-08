package fileCRW_Pkg;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

 public class FileCRW_Class {

	 @Test
	 public File FileCreation() throws IOException
	 {
		 File fCreation=new File("E:\\Selenium Training\\Videos\\Session#14\\Part-1\\Test.txt");
		fCreation.createNewFile();
		return fCreation;
	 }
	 
	 public void FileWritting() throws IOException
	 {
		 File fi=FileCreation();
		 FileWriter fr=new FileWriter(fi);
		 BufferedWriter buffr=new BufferedWriter(fr);
		 buffr.write("test");
		buffr.flush();
		fr.close();
	 }
	 
	 public void FileReading() throws IOException
	 {
		 File fCreation=new File("E:\\Selenium Training\\Videos\\Session#14\\Part-1\\Test.txt");
		
		 FileReader fr=new FileReader(fCreation);
		 BufferedReader buffr=new BufferedReader(fr);
		 String i="";
		    while((i=buffr.readLine())!=null)
		    {
		    	System.out.println(i);
		    }
	 }
	
	public static void main(String[] args) throws IOException {
		FileCRW_Class obj=new FileCRW_Class();
		obj.FileWritting(); 
		obj.FileReading();
	  	   
	}

}
