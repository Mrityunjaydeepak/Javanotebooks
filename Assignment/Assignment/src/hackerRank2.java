package myproject;
import java.util.*;
public class hackerRank2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		if(n%2==0 && (2>=n && n<=5))
		{
			System.out.println("Not Weird");
		}
		else if(n%2==0 && (6>=n && n<=20)) {
			System.out.println("Weird");
		}
		else if(n%2==0 && n>20) {
			System.out.println("Weird");
		}
		else {
			System.out.println("Not Weird");
		}
		
		

	}

}
