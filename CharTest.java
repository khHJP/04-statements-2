package com.sh.test.condition;

import java.util.Scanner;

public class CharTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 입력해주세요. > ");
		String ch = sc.next();

		if (ch.matches("^[0-9]*$")) {
			System.out.println("입력하신 문자 " + ch + " 은/는 숫자입니다.");
		}
		else if (ch.matches("^[a-zA-z]*$")) {
			System.out.println("입력하신 문자 " + ch + " 은/는 알파벳입니다.");
		}
		else if (ch.matches("[^a-zA-Z0-9\\\\s]")) {
			System.out.println("입력하신 문자 " + ch + " 은/는 특수문자입니다.");
		}

	}

}
