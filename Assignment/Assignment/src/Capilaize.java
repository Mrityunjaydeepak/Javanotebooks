package myproject;
import java.util.*;
public class Capilaize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=  new Scanner(System.in);
		String S=sc.nextLine();
		String newWord="";
		for(int i =0 ;i<S.length();i++)
		{
			if(i%2==0) {	
				newWord+=Character.toUpperCase(S.charAt(i));
				
				
				
			}
			else {
				newWord+=Character.toLowerCase(S.charAt(i));
			}
		}
		System.out.println(newWord);
	}

}
