import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    System.out.println("enter number of minutes=");
	    double min = sc.nextDouble();
	    
	    long years = (long) (min/(60*24*365));
	    long days = (long) (min/60/24)%365;
	    
		System.out.println(min +"number of minutes " + years+ "years & " + days+ "days");
	}
}
