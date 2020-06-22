package com.marlabs.Logical;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReasdFile
{


	    public static void main(String[] args) throws IOException {

	    	 FileReader fr=new FileReader("F:\\T.txt");    
//	    	 File file = new File(".");
//	    	 for(String fileNames : file.list()) System.out.println(fileNames);
	          int i;    
	          while((i=fr.read())!=-1)    
	          System.out.print((char)i);    
	          fr.close();    

	    }

	}

