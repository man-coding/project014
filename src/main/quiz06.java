package main;

public class quiz06 {

	public static void main(String[] args) {

		
		try {
			Book book = new Book();
		} catch (NoClassDefFoundError e) {
			System.out.println(e);
		}
		System.out.println("정상 종료");
	}
}

class Book {

}