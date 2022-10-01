package HW_0828;

import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

import HW0814.car;

class  sCar extends goods {
	String good;
	int newStuck;
	int qua;
	int total;
	int price;
		public sCar(int go,int qu) {
			this.good=(String)goods.get(go-1);
			this.newStuck=quality.get(good)-qu;
			this.qua=qu;
			this.price=selling.get(good);
			this.total=Math.round(qu*price);
			quality.replace(good, newStuck);
		}
		public String toString() {
			return String.format("產品名稱：%s\t購買數量：%s%n\t\t產品價格：%s\t\t合計：%s", good,qua,price,total);
		}
	}

public class shopCar extends goods {
	static Scanner scan=new Scanner(System.in);
	private static HashMap shopC = new HashMap<>();
	HashMap cas =new HashMap<>();
	void display(String member) {
		int g=1;
		int q=1;
		int po=1;
		while(g!=0||q==0) {
			System.out.println("請輸入產品代號及購買數量，如需跳出請按0");
			g=scan.nextInt();
			q=scan.nextInt();
			if(g>goods.size()) {
				System.out.println("輸入錯誤請重新輸入");
			}else {
				sCar s=new sCar(g, q);
				String PO=member+"-"+po;
				po++;
				shopC.put(PO, s);
				cas.put(PO, s.total);
			}			
		}
		System.out.println(shopC.toString());
	}
	void cash(String member) {
		basel();
		int total = 0;
		for(int i =0;i<=shopC.size();i++) {
			String poString=member+"-"+i;
			int n=(int) cas.get(poString);
			System.out.println(shopC.toString());
			total+=n;
		}
		System.out.println("總金額："+total);
		System.out.println("請至櫃檯結帳謝謝");
	}
	

}

	
	

