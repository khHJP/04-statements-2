package com.sh.test.loop;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		Test4 te = new Test4();
		te.test();
	}

	public void test() {

		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력 : ");
		String str = sc.next();

		System.out.println("검색할 문자 입력 : ");
		char word = sc.next().charAt(0);

		int count = 0;

		if ((word >= 'a' && word <= 'z') || (word >= 'A' && word <= 'Z')) {
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == word) {
					count++;
				}

			}
			System.out.printf("'%s'가 포함된 개수 : %d 개", word, count);

		}
		else {
			System.out.println("영문자가 아닙니다."); return;
		}
	}
}
