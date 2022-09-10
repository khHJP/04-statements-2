package com.sh.test.condition;

import java.util.Scanner;

/*
 * 리터당 가격 * 사용량 => 총 사용요금 
 * 사용요금 * 0.05
 * 사용요금 + 수도세 
 */

public class SwitchTest1 {
	public static void main(String[] args) {
		SwitchTest1 te = new SwitchTest1();
		te.test();

	}
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.println("----------menu----------\n"
				+ "1. 가정용 (50원/liter)\n"
				+ "2. 상업용 (45원/liter)\n"
				+ "3. 공업용 (30원/liter)\n"
				+ "-------------------------\n");
		System.out.print("메뉴번호를 선택하세요. ==> ");
		int menu = sc.nextInt();
		
		if (!(menu == 1 || menu == 2 || menu == 3)) {
			System.out.println("메뉴번호는 1,2,3만 가능합니다."); return;
		}
		
		System.out.print("물 사용량을 입력하세요. ==> ");
			double water = sc.nextInt();
			
			String choice = "";
			double fee = 0;
			double tax = 0;		
			int sum = 0;
			
			switch(menu) {
			case 1 : choice = "1. 가정용";
						fee = (int) (50 * water); 
						tax = fee * 0.05;
						sum = (int) (fee + tax); break;

			case 2 : choice = "2. 상업용";
						fee = (int) (50 * water); 
						tax = fee * 0.05;
						sum = (int) (fee + tax); break;

			case 3 : choice = "3. 공업용";
						fee = (int) (50 * water); 
						tax = fee * 0.05;
						sum = (int) (fee + tax); break;
						
			default : 	System.out.println("메뉴번호는 1,2,3만 가능합니다."); return;
			}
			System.out.print("----------<<수도세>>-----------\n"
					+ "선택메뉴번호 : "+ choice + "을 선택하셨습니다.\n"
					+ "사용요금 : "+ fee +"\n"
					+ "수도세 : " + tax + "\n"
					+ "총수도요금 : " + sum);
			
		
			
	
	}
		
			
		
	
}

