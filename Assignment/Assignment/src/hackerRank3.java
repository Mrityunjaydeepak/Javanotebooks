package myproject;
import java.util.*;
public class hackerRank3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String S=sc.nextLine();
		String s[]= sc.nextLine().split(" ");
		int start=Integer.parseInt(s[0]);
		int end =Integer.parseInt(s[1]);
		String next=S.substring(start, end);
		System.out.println(next);
		
		

	}

}
