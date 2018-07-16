package com.luv2code.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {
		
		try {
			
			//create object mapper
			ObjectMapper mapper = new ObjectMapper();
			
			//read JSON file and map or convert to java POJO
			
			Student student = mapper.readValue(new File("data/sample-full.json"), Student.class);
			
			//testing by printing
			System.out.println("FIRST NAME: "+student.getFirstName());
			
			System.out.println(student.getAddress().getStreet());
			
			for(String a:student.getLanguages()) {
				System.out.println(a);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
	}

}
