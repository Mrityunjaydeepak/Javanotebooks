package myproject;
import java.util.*;	
public class Solution1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner( System.in );
		String S=sc.nextLine();
		int count=1;
		char[] arr= new char[S.length()];
		for(int i = 0 ; i < S.length(); i++)
		{
			char ch=S.charAt(i);
			if(ch==' ')
			{
				count++;
				
				
			}
		}
		System.out.println(count);
	}

}
