package HW_0828;

import java.awt.Component.BaselineResizeBehavior;
import java.lang.reflect.Member;
import java.util.HashMap;
import java.util.Scanner;

import ClassDemo.bank;

public class staff extends goods implements choose {
	static Scanner scan = new Scanner(System.in);

	public void chooseL1() {
		try {
			System.out.println("請輸入產品名稱：");
			
			String name = scan.next();
			if (goods.indexOf(name) >= 0) {
				System.out.println("此產品已存在\n\t1.重新輸入\n\t2.返回上一層");
				int i = scan.nextInt();
				if (i == 1) {
					chooseL1();
				} else {
					display();
				}
			} else {
				System.out.println("請輸入廠商名稱、進貨數量、進貨單價");
				String supplier = scan.next();
				int quan = scan.nextInt();
				int price = scan.nextInt();
				addnew(name, supplier, quan, price);
				showdatabase();
				System.out.println("請問要1.繼續2.返回上一層？");
				int i = scan.nextInt();
				if (i== 1) {
					chooseL1();
				} else {
					display();
				} 
				}
			}catch (Exception e) {
				System.out.println("輸入錯誤請重新輸入");
				chooseL1();
			
		
			}
		} 
			

	public void chooseL2() {
		try {
			System.out.println("請輸入產品名稱：");
			String name = scan.next();
			if (goods.indexOf(name) < 0) {
				System.out.println("此產品不存在\n\t1.重新輸入\n\t2.返回上一層");
				int i = scan.nextInt();
				if (i == 1) {
					chooseL2();
				} else {
					display();
				}
			} else {
				System.out.println("請輸入進貨數量");
				int quan = scan.nextInt();
				stuck(name, quan);
				showdatabase();
				System.out.println("請問要1.繼續2.返回上一層？");
				int i = scan.nextInt();
				if (i == 1) {
					chooseL2();
				} else {
					display();
				}
			}

		} catch (Exception e) {
			System.out.println("輸入錯誤請重新輸入");
			chooseL2();
		}
	}

	void chooseL3() {
		//try {
			System.out.println("請輸入產品名稱：");
			String name = scan.next();
			if (goods.indexOf(name) < 0) {
				System.out.println("此產品不存在\n\t1.重新輸入\n\t2.返回上一層");
				int i = scan.nextInt();
				if (i == 1) {
					chooseL3();
				} else {
					display();
				}
			} else {
				System.out.println("請輸入進貨單價");
				int price = scan.nextInt();
				replaceP(name, price);
				showdatabase();
				System.out.println("請問要1.繼續2.返回上一層？");
				int i = scan.nextInt();
				if (i == 1) {
					chooseL3();
				} else {
					display();
				}
			}

		/*} catch (Exception e) {
			System.out.println("輸入錯誤請重新輸入");
			chooseL3();
		}*/
	}

	void chooseL4() {
		showdatabase();
		System.out.println("1.返回上一層");
		int i = scan.nextInt();
		if (i == 1) {
			display();
		}
	}

	void display() {
		basel();
		System.out.println("1.新增資料\n2.新增庫存\n3.更改進價\n4.查看資料");
		try {
			int s = scan.nextInt();
			switch (s) {
			case 1:
				chooseL1();
				break;
			case 2:
				chooseL2();
				break;
			case 3:
				chooseL3();
				break;
			case 4:
				chooseL4();
				break;
			}
		} catch (Exception e) {
			System.out.println("輸入錯誤請重新輸入");
			display();
		}

	}

	HashMap<String, String> member = new HashMap<>();

	void bsel() {
		member.put("M0001", "kevin");
		member.put("M0002", "kelly");
		member.put("M0003", "kurt");
		member.put("M0004", "anna");
	}

	// 員工代號
	public void login() {
		bsel();
		System.out.println("請輸入員工代號");
		try {
			String i = scan.next();
			if (member.containsKey(i)) {
				display();
			} else {
				System.out.println("無此代碼，將返回上一層");
				shop shop = new shop();
				shop.play();
			}
		} catch (Exception e) {
			System.out.println("輸入錯誤請重新輸入");
			login();
		}
	}

	public static void main(String[] args) {
		/*staff s=new staff();
		s.basel();
		s.chooseL3();*/
	}
}
