package quiz02;
import java.util.*;
import java.util.InputMismatchException;

public class main {

	public static void main(String[] args) {
		Hospital H=new Hospital();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Welcome to Military Hospital\n1. Hospital Data\n2. Patient Data\nChoose:");
		int choice=sc.nextInt();
		
		if(choice==1) {
		System.out.println("\nHospitals Data");
		
		
		H.setData("Military Hospital", "Saddar Rawalpindi", "*****", "051-5565544-5", 100000, 150);
		
		
		
		
		
		H.PrintHospitalData();
		H.FileWriting();
		}
		else if(choice==2) {
		System.out.println("\nPatients Data");
		Patient p=new Patient();
		
		p.setPatient("Usama Khan", "12345", "F6,Islamabad","Fever");
				
		p.PrintPatientData();
		
		p.FileWritingP();
		
		}
		
		else 
		{
			throw new InputMismatchException("Invalid Input");
		}

	}
	
	
	

}
