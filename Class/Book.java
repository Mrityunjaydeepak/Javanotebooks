package myproject;

import java.util.Scanner;

public class Book {
	String title, author, publisher;
	double price;
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of the books:");
		int n= sc.nextInt();
		Book[] b= new Book[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter the Title of the book"+(i+1));
			b[i].title=sc.nextLine();
			System.out.println("Enter the author of the book"+(i+1));
			b[i].author = sc.nextLine();
			System.out.println("Enter the Publisher of the book"+(i+1));
			b[i].publisher=sc.nextLine();
			System.out.println("Enter the price of the book"+(i+1));
			b[i].price = sc.nextDouble();
			
		}
		System.out.println("Enter the name of the publisher");
		String s=sc.nextLine();
		for(int i=0;i<n;i++) {
			if(b[i].author==s) {
				System.out.println(b[i].title);
			}
			
		}
	

}
}
