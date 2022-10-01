package HW_0828;

import java.util.HashMap;
import java.util.Scanner;

public class customer extends goods implements choose {
	static Scanner scan = new Scanner(System.in);
	shopCar shopCar=new shopCar();
	public void chooseL1() {
		System.out.println("請再次輸入客戶代號");
		String s=scan.next();
		shopCar.display(s);
	}
	public void chooseL2() {
		System.out.println("請再次輸入客戶代號");
		String s=scan.next();
		shopCar.cash(s);
		
	}

	void display() {
		customer();
		System.out.println("1.加入購物車\n2.結帳");
		try {
			int s = scan.nextInt();
			switch (s) {
			case 1:
				chooseL1();
				break;
			case 2:
				chooseL2();
				break;
			}
		} catch (Exception e) {
			System.out.println("輸入錯誤請重新輸入");
			e.getMessage();
			display();
		}
	}

	
	
	HashMap<String, String> member = new HashMap<>();

	void Mbsel() {
		member.put("C0001", "anna");
		member.put("C0002", "minie");
		member.put("C0003", "leo");
		member.put("C0004", "ruby");
	}
	public void login() {
		basel();
		Mbsel();
		System.out.println("請輸入客戶代號");
		try {
			String LM1 = scan.next();
			if (member.containsKey(LM1)) {
				display();
			} else {
				System.out.println("無此代碼，將返回上一層");
				shop shop = new shop();
				shop.play();
			}
		} catch (Exception e) {
			System.out.println("輸入錯誤請重新輸入");
			e.getMessage();
			login();
		}
	}

}
