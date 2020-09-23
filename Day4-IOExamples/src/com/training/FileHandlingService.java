package com.training;

import java.io.*;
public class FileHandlingService{

	public void writeToFile(File file,Customer customer)
{
		PrintWriter writer=null;
		try {
			writer=new PrintWriter(new FileWriter(file,true));
			writer.println(customer.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		finally{
			writer.close();
		}
}
	public void readFRomFile(File file){
		try {
			BufferedReader reader= new BufferedReader(new FileReader(file));
			String line=null;
			while(line= reader.readLine()!=null){
				System.out.println(line);
			}catch(FileNotFoundException e){
				e.printStackTrace();
			}catch(IOException){
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
