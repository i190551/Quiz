package quiz02;
import java.util.Random;


import java.io.FileWriter;
import java.io.IOException;

  class Patient extends Hospital {

	
	private String name,contact,address,disease;
	//int unique_id;
	
	public void setPatient(String n,String c,String ad,String dis)
	{
		name=n;
		contact=c;
		address=ad;
		disease=dis;
	}
	
	public String getnamep() {
		return name;
	}
	
	public String getcontp()
	{
		return contact;
	}
	
	public String getaddress()
	{
		return address;
	}
	
	public String getdisease()
	{
		return disease;
	}
	
	
	public void PrintPatientData()
	{

		System.out.println("Name of Patient:"+getnamep());

		System.out.println("Contact:"+getcontp());
		

		System.out.println("Address:"+getaddress());

		System.out.println("Disease:"+getdisease());
	}
	
	void FileWritingP()
	{
		
		try {
			
		//	System.out.println("......."+getName());
			FileWriter myfile=new FileWriter("File2.txt");
			
			myfile.write("Patient Details");

			myfile.write("\nName of Patient:"+getnamep());

			myfile.write("\nCell #:"+getcontp());
			

			myfile.write("\nAddress:"+getaddress());

			myfile.write("\nSuffering From:"+getdisease());
			
			myfile.close();
			
			System.out.println("Successfully written in a file");
		} catch(IOException e)
		{
			System.out.println("Error Occurred");
			e.printStackTrace();
		}
		
		
		
	}
	

	
}
