package main;

public class Ex03 {

	public static void main(String[] args) {

		int[] arr = new int[5];

	
		
		//런타임오류 예외처리   에러가 나면 예외처리, 에러가 안 나면 그냥 다음으로 실행
		try {
			arr[3] = 5;
		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println(e);
		}
		
		System.out.println("프로그램이 정상 종료됩니다.");
	}
}
