package main;

public class Ex05 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];

		try {
			int i = 0/0;

		} catch (ClassCastException e) {
			System.out.println(e);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch(Exception e) { // -> Exception e = new ArrayIndexOutOfBoundsException
			System.out.println(e); //Exception 은 항상 마지막 catch 블록에 넣어줘야 한다.
		}
		System.out.println("프로그램이 정상 종료됩니다.");

	}

}
