package mybooks.Book;

public class Book {


	public Book(String writerName, String bookName, int yearOfRelease, int price) throws IllegalArgumentException {
		super();
		if (price<0) {
			throw new IllegalArgumentException("price cannot be negative");
		}
		this.writerName = writerName;
		this.bookName = bookName;
		this.yearOfRelease = yearOfRelease;
		this.price = price;
	}

	private String writerName;
	private String bookName;
	private int yearOfRelease=1990;
	private int price;
	public String getWriterName() {
		return writerName;
	}
	@Override
	public String toString() {
		return "Book [writerName=" + writerName + ", bookName=" + bookName + ", yearOfRelease=" + yearOfRelease
				+ ", price=" + price + "]";
	}
	public void setWriterName(String writerName) {
		this.writerName = writerName;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getYearOfRelease() {
		return yearOfRelease;
	}
	public void setYearOfRelease(int yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int increasePriceByPercentage(int bookPrice, float percentage) {
		return (int) (bookPrice+bookPrice*percentage/100);
	}
	

}
