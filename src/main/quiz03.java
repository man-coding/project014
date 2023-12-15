package main;

public class quiz03 {

	public static void main(String[] args) {

		

		try {
			Object obj = new Integer(0);
			String str = (String) obj;
		} catch (ClassCastException e) {
			System.out.println(e);
		}
		System.out.println("프로그램을 정상 종료하였습니다");

	}

}
