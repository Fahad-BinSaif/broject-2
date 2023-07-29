package MyFirstoopObject;

public class Rectangle {
	
	private double length = 0;
	private double wedth = 0;
	private double Area = 0;
	public Rectangle () {
		length = 10;
		wedth = 15;
	}
	public void modifyobject (Rectangle r) {
		r.length = 67 ;
		r.wedth = 70 ;
		
	}
	public Rectangle add (Rectangle room1,Rectangle room2) {
		Rectangle result = new Rectangle ();
		result.length = room1.length+room2.length ;
		result.wedth = room1.wedth+room2.wedth  ;
		
		return result ;
	}
	public Rectangle (double l , double w) {
		length = l;
		wedth = w;
		
	}
	public void setLength (double l) {
		length = 70;
		length = l;
		
	}
	public void setWedth (double w) {
		wedth = w;

}

	public double getLength () {
		if (length <= 0) {
			System.out.println("Error !");
			return -1;
		}
		else 
			return length;
	}
	public double getWedth () {
		if (wedth <= 0) {
			System.out.println("Error !");
			return -1;
		}
		else 
			return wedth;
	}
	public double getArea () {
		if (wedth <= 0||length <= 0) {
			System.out.println("Error !");
			return -1;
		}
	
		else 
			return Area = wedth * length;
	}
	
	


	}