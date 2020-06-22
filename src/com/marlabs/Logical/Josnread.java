package com.marlabs.Logical;

import java.io.FileReader;
import java.io.FileWriter;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Josnread {
	public static void main(String[] args) {
		String filePath = "F:\\\\T.json";
		 try {
		        FileReader reader = new FileReader(filePath);
		        JSONParser jsonParser = new JSONParser();
		        JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
		        System.out.println(jsonObject);
		        FileWriter fowriter = new FileWriter("F:\\g.txt");
		        fowriter.write(" hio how are you i am writing application");
		        fowriter.close();
		        
		    }catch (Exception e) {
		        System.out.println(e);
		    }
		}
	}


