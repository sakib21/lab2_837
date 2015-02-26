package interpreter;

import java.io.BufferedReader;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class interprete {
	HashMap hm = new HashMap();
	String[] myString = new String[200];
	
	public void let(int index)
	{
		
		String[] parts = myString[index].split(" ");
		String part1 = parts[0]; 
		System.out.println("first value is : " + part1);
		String part2 = parts[1]; 
		System.out.println("second value is : " + part2);
		String part3 = parts[2];
		System.out.println("third value is : " + part3);
		String part4 = parts[3];
		System.out.println("fourth value is : " + part4);
		
		variable obj = new variable(part1 ,Integer.parseInt(part4));
		System.out.println("the value of x is :" + obj.get());
		hm.put(part1, obj);
		System.out.println("the value hash map is : " + ((variable) hm.get(part1)).get());
		
	}
	
	
	public void print(int index)
	{
		
		String[] parts = myString[index].split(" ");
		String part1 = parts[0]; 
		System.out.println("first value is : " + part1);
		String part2 = parts[1]; 
		System.out.println("second value is : " + part2);
		
		hm.get(part2);
		System.out.println("the value for print hash map is : " +  ((variable) hm.get(part2)).get());
		
	}
	
	
	public void readFile(){
		try {
			BufferedReader buffRead = new BufferedReader(new FileReader("D:\\input.txt"));
			if(buffRead == null){
				System.out.println("could not open the file");
			}
			
			
			String initialLine;
			int i=0;
			try {
				while ((initialLine = buffRead.readLine()) != null)
				{
					
						
					myString [i]= initialLine;
					i++;
					
				}
				
					int j=0;
				while(myString[j] != null)
				{
					String[] box = myString[j].split(" ");
					String part1 = box[0]; 
					System.out.println("first value is : " + part1);
					
					if (myString[j].equals("let"))
					{
						
						
						let(j);
					}
					
					
					else if(myString[j].equals("print"))
					{
						
						
						
						print(j);
						
					}
					
					j++;
				}
							
						
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
	
	

}
