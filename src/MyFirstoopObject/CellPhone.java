package MyFirstoopObject;
// need focus 
public class CellPhone {
	private String manufact ;
	private String model ;
	private double retailPrice ;
	
	public void setManufact (String man) {
		if (man == "huawei") {
		manufact = man;
		
		}
		else if (man == "apple"){ 
        manufact = man;
	   
		}
		else if (man == "samsung") {
	    manufact =  man;
				
		}	
		else {
		System.out.println("Out of range"); 
		}     
	}
	public void setModel (String mod) {
		model = mod ;
		
	}
	public void setRetailPrice (double price) {
		retailPrice = price ;
	}
	public String getManufact () {
		
		
		return manufact ;
	}	
	public String getModel () {
		
		if (manufact == "apple") {
			if (model == "iphone 11" || model == "iphone 12" || model == "iphone 13") {	
				return model;
			}
			else 
				return "Out of range";
			}
		else if (manufact == "samsung") {
				if (model == "s22" || model == "s21" || model == "s20") {
				return model ;	}
				else 
					return "Out of range";
				
		}
					
		else if (manufact == "huawei") {
			if (model == "p60" || model == "p50" || model == "p40") {
				return model ;
			}
			else 
				return "Out of range";
			
	}
		else 
		
		return "Out of range !!" ;

		
	}
	public double getRetailPrice () {
		if (model == "iphone 11") {
			System.out.print("\nThe price is in Saudi riyals = ");
		return 2500 ;
		}
		else if (model == "iphone 12") {
			System.out.print("\nThe price is in Saudi riyals = ");
			return 3500 ;
		}
		else if (model == "iphone 13") {
			System.out.print("\nThe price is in Saudi riyals = ");
			return 4000 ;
		}
		else if (model == "s20") {
			System.out.print("\nThe price is in Saudi riyals = ");
			return 2380 ;
		}
		else if (model == "s21") {
			System.out.print("\nThe price is in Saudi riyals = ");
			return 3150 ;
		}
		else if (model == "s22") {
			System.out.print("\nThe price is in Saudi riyals = ");
			return 3890 ;
		}
		else if (model == "p40") {
			System.out.print("\nThe price is in Saudi riyals = ");
			return 1800 ;
		}
		else if (model == "p50") {
			System.out.print("\nThe price is in Saudi riyals = ");
			return 2150 ;
		}
		else if (model == "p60") {
			System.out.print("\nThe price is in Saudi riyals = ");
			return 3230 ;
		}
		else {
			System.out.println("\nOut of range !!");
			return 0;
		}
	}
	public void prinInfo () {
		System.out.println(" The manufacturer is : " + manufact +
				           "\n Phone type is : "+ model + 
				           "\n The price of the phone is : "+retailPrice);
	}
	}	
		
		
			
		
	
	
	
	


