package myproject;
import java.util.*;
public class test5 {
	public static float tempChange(float fah) {
		float temp=(fah-32)*1.8;
		return temp;
		
	}
public static void main( String [] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter fah");
	float f=sc.nextFloat();
	float cel=tempChange(f);
	System.out.println(cel);
}
}
