package com.sh.test.loop;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Test2 te = new Test2();
		te.test();
	}
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i <= num; i++) {
			if(i%2 == 0) {
				System.out.print('박');
			}	
			else {
				System.out.print('수');
			}
		}
		
	}

}
