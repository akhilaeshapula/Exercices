package com.training.day5.exercise1;
import java.io.*;

public class CreditCardService {
	public void writeToFile(File file,CreditCardDetails[] details, int choice){
		switch(choice){
		case 1:
			writeinCharacter(file, details);
			break;
		case 2:
			writeinBytes(file, details);
			break;
		default:
			throw new RuntimeException("Invalid message- Try again");
				
		}
	}
	
	public void writeToFile(CreditCardDetails[] details,int choice) {
	switch(choice){
	case 1: writeinCharacter(new File("details.txt"),details);
			break;
	case 2: writeinBytes(new File("deatils.ser"),details);
			break;		
	}
	}
	public void writeinCharacter(File file,CreditCardDetails[]details){
		PrintWriter writer= null;
		try {
			writer= new PrintWriter(file);
			for(int i=0;i<details.length;i++){
				writer.println(details[i].toString());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			writer.close();
		}
	}
	public void writeinBytes(File file, CreditCardDetails[]details){
		ObjectOutputStream out=null;
		try{
			out=new ObjectOutputStream(new FileOutputStream(file));
			for(int i=0;i<details.length;i++){
				out.writeObject(details[i]);
				}try{
			out.close();}
		catch(IOException e){
			e.printStackTrace();
		}
	}catch(FileNotFoundException e){
		e.printStackTrace();
	}catch(Exception e){
		e.printStackTrace();}
	}
		public CreditCardDetails[] readCharacter(File file) throws IOException{
			BufferedReader in=null;
			String[] returnarr= new String[10]; 
			try{
				in =new BufferedReader(new FileReader(file));
				while(in.readLine()!=null){
				
						
			}	
	}
}
