package HW_0828;

import java.util.Scanner;

public class shop {
	static Scanner scan = new Scanner(System.in);

	void play() {
		System.out.println("1.員工2.顧客");
		try {
			int i = scan.nextInt();
			if (i == 1) {
				staff aStaff = new staff();
				aStaff.login();
			} else {
				customer customer = new customer();
				customer.login();
			}
		} catch (Exception e) {
			e.getMessage();
		}
			
		
	}

	public static void main(String[] args) {
		shop shop = new shop();
		shop.play();

	}
}
