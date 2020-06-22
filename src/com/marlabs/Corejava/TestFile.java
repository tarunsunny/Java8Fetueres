package com.marlabs.Corejava;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TestFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println(new java.io.File("").getAbsolutePath());
		File fole = new File("in.txt");
		System.out.println("Attempting to read from file in: "+fole.getCanonicalPath());

        Scanner input = new Scanner(fole);
        String in = "";
        in = input.nextLine();
		//File("C:\\Users\\pankaj\\Desktop\\test.txt"); 
		Scanner sc = new Scanner(fole);
		System.out.println(sc.next());
		System.out.println(sc.next());
		System.out.println(sc.next());
		System.out.println(sc.next());
		

	}

}
