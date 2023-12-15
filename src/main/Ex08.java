package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex08 {

	public static void openTextFile() throws FileNotFoundException {

		FileInputStream fis = new FileInputStream("src/main/a.txt");
	}

	public static void main(String[] args) { // 메인함수에서는 예외처리를 보통 다 한다.(메인에서 던진다는 건 안 하겠다는 뜻이나 마찬가지)

		try {
			openTextFile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
