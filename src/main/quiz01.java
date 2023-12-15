package main;

public class quiz01 {

	public static void main(String[] args) {

		try {
			int num = 0 / 0;
		} catch (ArithmeticException e) {
			System.out.println(e);
		}

		System.out.println("프로그램이 정상 종료됩니다.");
		// 실무에서 예외처리를 했다는 것을 보고하여 안전성을 증명해야 함.

	}
}
