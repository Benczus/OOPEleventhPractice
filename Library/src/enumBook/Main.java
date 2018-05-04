package enumBook;

import java.util.ArrayList;
import java.util.Scanner;

import enumBook.BookWithEnum.Style;
import mybooks.Book.Book;

public class Main {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int numberOfBooks= scanner.nextInt();
		BookWithEnum[] bookArray= new BookWithEnum[numberOfBooks];
		
		for (int i = 0; i < bookArray.length; i++) {
			bookArray[i]= new BookWithEnum("CICA", "KUTYA", 1995, 123132, Style.SCIFI);
		}
		displayBookData(bookArray);
		BookWithEnum[] scifiBooks= getScifiData(bookArray, Style.SCIFI); 
		for (BookWithEnum bookWithEnum : scifiBooks) {
			System.out.println(bookWithEnum);
		}
	}
	
	public static void displayBookData(Book[] books) {
		for (Book book : books) {
			System.out.println(book);
		}
	}
	public static BookWithEnum[] getScifiData(BookWithEnum[] books, Style style) {
		BookWithEnum[] bookWithEnum= new BookWithEnum[books.length];
		
		int counter=0;
		for (BookWithEnum book : books) {
			if (book.getStyle()==style) {
				bookWithEnum[counter]=book;
				counter++;
			}
		}
		BookWithEnum[] bookWithEnum2= new BookWithEnum[counter];
		for (int i = 0; i < counter; i++) {
			bookWithEnum2[i]= bookWithEnum[i];
		}
		return bookWithEnum2;
		
	}

}
