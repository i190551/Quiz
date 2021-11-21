package quiz02;





abstract class Ward {
	
	private int beds;
	 public int numberofBeds()
	 {
		 return beds;
	 }
	 

	
	
	

}


class male_wards extends Ward
{
	private int beds_;
	
	public void setBeds(int bed)
	{
		beds_=bed;
		
	}
	public int numberofBeds()
	{
	
		return beds_;
			
	}
	
	
	
}

class female_wards extends Ward
{
	private int beds_f;
	
	public void setBeds(int bed)
	{
		beds_f=bed;
	}
	
	public int numberofBeds()
	{
		return beds_f;
	}
	
}
