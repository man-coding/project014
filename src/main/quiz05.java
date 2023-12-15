package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class quiz05 {

	public static void main(String[] args) {

		System.out.println("정수를 입력하세요.");

		try {
			Scanner scanner = new Scanner(System.in);
			int num = scanner.nextInt();

		} catch (InputMismatchException e) {
			System.out.println(e);
		}
		System.out.println("정상종료");
	}

}
