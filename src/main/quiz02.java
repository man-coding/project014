package main;

public class quiz02 {

	public static void main(String[] args) {

		String s = null;

		try {
			System.out.println(s.length());
		} catch (NullPointerException e) {
			System.out.println(e);

		}

		System.out.println("프로그램이 정상 종료됩니다.");
	}

}
