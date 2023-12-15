package main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

public class quiz07 {

	public static void main(String[] args) {

		// 숫자 목록 생성
		Set<Integer> set = new HashSet<>();

		set.add(1);
		set.add(2);
		set.add(3);

		Iterator<Integer> iterator = set.iterator(); // set을 순회할 때 사용하는 iterator

		try {
			int num1 = iterator.next();
			int num2 = iterator.next();
			int num3 = iterator.next();
			int num4 = iterator.next(); // 요소가 3개밖에 없는데 4개 호출함
		} catch (NoSuchElementException e) {
			System.out.println(e);
		}
		System.out.println("정상종료");
	}

}
