package main;

public class quiz04 {

	public static void main(String[] args) {

		try {
			String str = "1.23";
			int num = Integer.parseInt(str);
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
		System.out.println("정상종료");

	}

}
