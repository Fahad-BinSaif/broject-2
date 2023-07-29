package Reminder;
//write a program that finds sum and average for positive number ...
import java.util.Scanner;
public class Ex_array {

	public static void main(String[] args) {
		Scanner arr = new Scanner (System.in);
		// TODO Auto-generated method stub
		int [] ar = new int [5];
		double sum = 0;
		int count = 0;
		for (int i = 0 ; i < ar.length ; i++) {
			System.out.println("Enter number");
			ar[i]=arr.nextInt();
		
			if (ar[i]>0) {
				sum+=ar[i];
			    count++;
			}
	        }
		System.out.println("Sum is : "+sum);
	    System.out.println("Ave is : "+sum/count);
	}
}
