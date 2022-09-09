package com.sh.test.condition;

import java.util.Scanner;

public class Test9 {
	public static void main(String[] args) {
		Test9 te = new Test9();
		te.test();
	}

	public void test() {
		Scanner sc = new Scanner(System.in);
		// 주메뉴 선택
		String mainMenu = "*********주메뉴*********\n" 
				+ "a. 불고기버거 ------------5000\n"
				+ "b. 새우버거 --------------4000\n" 
				+ "c. 치킨버거 --------------4500\n" 
				+ "d. 한우버거 -------------10000\n"
				+ "e. 디버거 ----------------7000\n" 
				+ "***********************";
	
		String sideMenu = "*******사이드메뉴********\n" 
				+ "1. 콜라 -------------------1500\n"
				+ "2. 사이다 -----------------1500\n" 
				+ "3. 밀크쉐이크-------------2500\n"
				+ "4. 레드불------------------3000\n" 
				+ "***********************";
		
		System.out.println(mainMenu);
		System.out.print("주메뉴를 선택하세요 : \n");
		String mainDish = sc.next();

		// 가격, 주메뉴 이름, 사이드메뉴 이름.
		int price = 0;
		String mName = "";
		
		
		// mainMenu switch
		switch (mainDish) {
		case "a":
			price = 5000;
			mName = "불고기버거";
			break;

		case "b":
			price = 4000;
			mName = "새우버거";
			break;

		case "c":
			price = 4500;
			mName = "치킨버거";
			break;

		case "d":
			price = 10000;
			mName = "한우버거";
			break;

		case "e":
			price = 7000;
			mName = "디버거";
			break;

		default : System.out.println("번호를 잘못 누르셨습니다. 영업을 종료합니다."); return;
		}
		
		
		// 사이드메뉴 선택
		System.out.println(sideMenu);
		System.out.print("사이드메뉴를 선택하세요 : \n");
		String sideDish = sc.next();
		
		int price2 = 0;
		String sName = "";
		
		// 사이드메뉴 switch
		switch (sideDish) {
		case "1":
			price2 = 1500;
			sName = "콜라";
			break;

		case "2":
			price2 = 1500;
			sName = "사이다";
			break;

		case "3":
			price2 = 2500;
			sName = "밀크쉐이크";
			break;

		case "4":
			price2 = 3000;
			sName = "레드불";
			break;
			
		default : System.out.println("번호를 잘못 누르셨습니다. 영업을 종료합니다."); return;
		}

		System.out.printf("%s, %s는(은) 총 %d원입니다.", mName, sName, price + price2);

	}

		
}


	


