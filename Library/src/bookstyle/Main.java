package bookstyle;

import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;

import mybooks.Book.Book;

public class Main {

	public static void main(String[] args) {
		
	Scanner scanner= new Scanner(System.in);
	System.out.println("Please enter the number of books!");
	int numberOfBooks= scanner.nextInt();
	BookStyle[] books= new BookStyle[numberOfBooks];
	String[] styles= new String[numberOfBooks];
	Collection<String> setOfStyles= new HashSet<>();
	
	
	for (int i = 0; i < books.length; i++) {
		System.out.println("Please enter the name of the writer!");
		String writerName= scanner.next();
		System.out.println("Please enter the name of the book!");
		String bookName= scanner.next();
		System.out.println("Please enter the year of release!");
		int yearOfRelease= scanner.nextInt();
		System.out.println("Please enter the price of the book!");
		int price= scanner.nextInt();
		System.out.println("Please enter the style of the book!");
		String style= scanner.next();
		books[i]= new BookStyle(writerName, bookName, yearOfRelease, price, style);
		setOfStyles.add(books[i].getStyle());
		
		}	
	
	for (String string : setOfStyles) {
		System.out.println(string);
	}
	
	for (BookStyle book : books) {
		if (book.getStyle().equals("Scifi")) {
			System.out.println(book);
		}
	}
	int avg= 0;
	int counter=0;
	for (BookStyle book : books) {
		if (book.getStyle().equals("Scifi")) {
			avg+=book.getPrice();
			counter++;
		}
	}
	avg/=counter;
	System.out.println(avg);
	}
}
