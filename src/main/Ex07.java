package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//finally문 사용하기
public class Ex07 {

	public static void main(String[] args) {
		// 스트림 변수 선언
		FileInputStream fis = null;

		try {
			fis = new FileInputStream("src/main/b.txt");
			System.out.println("a.txt 파일을 엽니다");

//			int i = 0 / 0;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ArithmeticException e) {
			e.printStackTrace();

		} finally { // 경우의 수와 상관없이 무조건 수행
			if (fis != null) {
				try {// 리소스를 닫게 하는 코드
					fis.close(); // 함수를 더 사용할 때 try 블록 안에 한번 더 예외처리 해줘야 함.
				} catch (IOException f) {
					f.printStackTrace();
				}
				System.out.println("사용한 리소스를 닫았습니다");
			}
		}
		System.out.println("끝");
	}

}
