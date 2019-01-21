package com.control;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Main {

	public static void main(String n[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter file name ::");
		String filename=s.next();
		System.out.println("Enter output file name::");
		String filename2=s.next();
		File f=new File("d:\\site\\"+filename);
		File ff=new File("d:\\site\\"+filename2);
		String k[]={"1.","2.","3.","4.","5.","6.","7.","8."};
		int pos[]={0,0,0,0,0,0,0,0};
		FileReader f1 = null;
		try {
			f1 = new FileReader(f);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		BufferedReader b=new BufferedReader(f1);
		int line=0;
		while(true){
			try {
				String test=b.readLine();
				line++;
				
				if(test==null)
					break;
				switch(test){
				   case "1.":
					   pos[0]=line;
				       break;
				   case "2.":
					   pos[1]=line;
				       break;
				   case "3.":
					   pos[2]=line;
				       break;
				   case "4.":
					   pos[3]=line;
				       break;
				   case "5.":
					   pos[4]=line;
				       break;
				   case "6.":
					   pos[5]=line;
				       break;
				   case "7.":
					   pos[6]=line;
				       break;
				   case "8.":
					   pos[7]=line;
				       break;     
				}
				System.out.println(test);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		for(int x : pos){
			System.out.println(x);
		}
	    try {
			b.close();
			f1.close();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
	    
	    
		
		try {
			b=new BufferedReader(new FileReader(f));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		int linenow=0;

		JSONObject j=new JSONObject();
		JSONObject curr=null;
		String type=null;
		String current=null;
		String prop=null;
		String value=null;
		List<String> larray=null;
		JSONArray ja=null;
		
		while(true){
			
		    try {
				 current=b.readLine();
				 if(current==null)
					 break;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   System.out.println(current);
		    if(current.equals("1.")){
		    	  
		    		type="object";
		    		prop="title";
		    		value="";
		    		continue;
		    		
		    }
		    
		    else if(current.equals("2.")){
		    	  j.put(prop, value);
		    	  value="";
		    	  type="object";
		    	  prop="duration";
		    	  continue;
		    	  
		    }
		    
		    
		    else if(current.equals("3.")){

		    	  j.put(prop, value);
		    	  value="";
		    	  curr=new JSONObject();
		    	  type="object";
		    	  prop="learn";
		    	  continue;
		    	  
		    }
		    
		    else if(current.equals("4.")){
		    	  j.put(prop, value);
		    	  value="";
		    	  larray=new ArrayList<String>();
		    	  type="array";
		    	  prop="learnTo";
		    	  continue;
		    	  
		    }
		    else if(current.equals("5.")){
		    	  j.put(prop,larray);
		    	  
		    	  value="";
		    	  type="object";
		    	  prop="benefits";
		    	  continue;
		    	  
		    }
		    else if(current.equals("6.")){
		    	  j.put(prop, value);
		    	  larray=new ArrayList<String>();
		    	  value="";
		    	  type="array";
		    	  prop="audience";
		    	  continue;
		    	  
		    }
		    
		    else if(current.equals("7.")){
		    	 j.put(prop, larray);
		    	  larray=new ArrayList<String>();
		    	  value="";
		    	  type="array";
		    	  prop="objectives";
		    	  continue;
		    	  
		    }
		    
		    else if(current.equals("8.")){
		    	  j.put(prop,larray);
		    	  curr=new JSONObject();
		    	  type="content";
		    	  prop="contents";
		    	  
		    }
		    System.out.println(type);
		    
		    if(type.equals("object")){
		    	value+=current;
		    }
		    
		    if(type.equals("array")){
		    	larray.add(current);
		    }
		    if(type.equals("content")){
		    	if(current.charAt(0)=='$'){
		    		
		    		if(ja==null){
		    			ja=new JSONArray();
		    		}
		    		else{
		    			curr.put("subtopics",larray);
		    			ja.add(curr);
		               
		    		}
		    		curr=new JSONObject();
		    		curr.put("topic", current.substring(1, current.length()));
		    		larray=new ArrayList<String>();
		    	}
		    	else
		    		larray.add(current);
		    }
		  
		    
		}
		
		j.put("content",ja);
		
		try{
		FileWriter ff2=new FileWriter(ff);
		BufferedWriter br=new BufferedWriter(ff2);
		br.write(j.toString());
		br.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
