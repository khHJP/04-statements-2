package com.sh.test.loop;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Test3 te = new Test3();
		te.test();
	}
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			if(1 <= num && num <10) {
				System.out.printf("%d x %d = %d\n", num, i , num*i);
			}	
			else {
				System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다."); return;
			}
		}
		
	}
}
