package quiz02;

import java.io.FileWriter;
import java.io.IOException;
public class Hospital {
	
	private String name,location,rating,contact;
	private int PricePerBed,BedsAvailable;
	
	
	
	public void setData(String nam,String loc,String Rat,String Cont,int pb,int ba)
	{
		name=nam;
		location=loc;
		rating=Rat;
		contact=Cont;
		PricePerBed=pb;
		BedsAvailable=ba;
		
		
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getLocation()
	{
		return location;
	}
	
	public String getRating()
	{
		
		return rating;
		
	}
	
	public String getContact()
	{
		return contact;
	
	}
	public int getPrice() {
		return PricePerBed;
	}

	
	public int getBeds()
	{
		
		return BedsAvailable;
	}
	
	
	void PrintHospitalData()
	{
			System.out.println("Welcome To CMH");

			System.out.println("Name of Hospital:"+getName());

			System.out.println("Location:"+getLocation());
			

			System.out.println("Ratings:"+getRating());

			System.out.println("Contact Number:"+getContact());
	
		
		
		
	}
	
	void FileWriting()
	{
		
		try {
			
		//	System.out.println("......."+getName());
			FileWriter myfile=new FileWriter("File1.txt");
			
			myfile.write("Hospital Details");

			myfile.write("\nName of Hospital:"+getName());

			myfile.write("\nLocation:"+getLocation());
			

			myfile.write("\nRatings:"+getRating());

			myfile.write("\nContact Number:"+getContact());
			
			myfile.close();
			
			System.out.println("Successfully written in a file");
		} catch(IOException e)
		{
			System.out.println("Error Occurred");
			e.printStackTrace();
		}
		
		
		
	}
	
	

	
}


