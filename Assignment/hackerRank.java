package myproject;
import java.util.*;
public class hackerRank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=  new Scanner(System.in);
		String A=sc.nextLine();
		String B= sc.nextLine();
		int sum= A.length() + B.length();
		System.out.println(sum);
		int lexo= A.compareTo(B);
		if(lexo>0) {
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	
		String fL = A.substring(0, 1);
		fL=fL.toUpperCase();
	    String rL = A.substring(1, A.length());
	    A=fL+rL;
	    String bL=B.substring(0,1);
	    bL=bL.toUpperCase();
	    String lB=B.substring(1,B.length());
	    B=bL+lB;
		System.out.println(A + " " + B);
		

	}

}
