package MyFirstoopObject;



public class MyFirstoopObject{

	public static void main(String[] args) {
	
		Employee e1 = new Employee ();
		e1.set_Name("Fahad");
		e1.set_ID(443100);
		e1.set_depart("Database");
		e1.set_resident(true);
		e1.set_salary(28000,4000);
		
		e1.print_Emp_Data();
		

}
	}
