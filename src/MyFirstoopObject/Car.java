package MyFirstoopObject;

public class Car {
	private String maker ;
	private int yearModel ;
	private static int count;
	public Car () {
		count++;
	}
	

	public void setMaker (String make ) {
		if (make == "NESAN" || make == "HONDAY" || make == "TOYOTA")
		maker = make ;
		else 
			System.out.println("Invalid maker");
		
	}
	public void setYearModel (int model) {
		if (model >= 2010)
		yearModel = model ;
		else 
			System.out.println("Invalid modil");
	}
	public String getMake () {
		return maker ;
	}
	public int getYearModel () {
		return yearModel ;
	}
	static int get_count () {
		return count;
	}
	
	

}
