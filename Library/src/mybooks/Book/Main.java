package mybooks.Book;

import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Book book = new Book("Cica","mano", 1995, 2);
		try {
		book= new Book("Cica","mano", 1995, -1);
		}
		catch (Exception e) {
			book.setPrice(0);
		}
		System.out.println(book);

	}

}
