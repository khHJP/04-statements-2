package com.sh.test.condition;

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		Test10 te = new Test10();
		te.test();
	}
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수입력 : ");
		int score = sc.nextInt();
		
		char grade = ' ';
		
		switch (score/10) {
		case 10 :
		case 9 : grade = '수'; break;
		case 8 : grade = '우'; break;
		case 7 : grade = '미'; break;
		case 6 : grade = '양'; break;
		default : grade = '가';			
		}
		System.out.printf("[%d]점은 [%s]입니다.", score, grade);
		
		
	}
	

}
