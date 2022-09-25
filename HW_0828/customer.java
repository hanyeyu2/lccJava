package HW_0828;

import java.util.HashMap;
import java.util.Scanner;

public class customer extends goods implements choose {
	static Scanner scan = new Scanner(System.in);

	@Override
	public void chooseL1() {
		customer();
	}

	@Override
	public void chooseL2() {

	}

	void display() {
		basel();
		customer();
		System.out.println("1.加入購物車\n2.查看購物車\n3.結帳\n4.查看訂單進度");
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
				break;
			case 4:
				break;
			}
		} catch (Exception e) {
			System.out.println("輸入錯誤請重新輸入");
			display();
		}
	}

	HashMap<String, String> member = new HashMap<>();

	void bsel() {
		member.put("C0001", "anna");
		member.put("C0002", "minie");
		member.put("C0003", "leo");
		member.put("C0004", "ruby");
	}

	public void login() {
		bsel();
		System.out.println("請輸入客戶代號");
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

}
