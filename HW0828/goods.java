package HW0828;

import java.io.ObjectOutputStream.PutField;
import java.util.*;


import ClassDemo.NewCity;
/**
 * 
 * 建立goods類別，有商品名稱、價格、廠商
 * 可以讓使用者自行建立，放入集合
 * 使用者可以快速搜尋到商品名稱，並顯示價格
 * 消費者可以依照目前所存在的商品放入購物車中
 * 當消費者結帳時，系統要出現每一個商品名稱、價格
 * 最後顯示結帳總額
 * @author merci
 */
class cookie {
	private String name;
	private int price;
	public cookie(String name,int price) {
		this.name=name;
		this.price=price;
	}
	public String toString() {
		return String.format("餅乾：(廠商:%s,價錢:%s)", name,price);
	}
}
class cake{
		private String name;
		private int price;
		public cake(String name,int price) {
			this.name=name;
			this.price=price;
	}
	public String toString() {
			return String.format("蛋糕：(廠商:%s,價錢:%s)", name,price);
	}
}
class drink{
	private String name;
	private int price;
	public drink(String name,int price) {
		this.name=name;
		this.price=price;
	}
	public String toString() {
		return String.format("蛋糕：(廠商:%s,價錢:%s)", name,price);
}
}


public class goods {
 static	List good=Arrays.asList(
			new cookie("wm",25),
			new cookie("MM",30)
			);

	//static HashMap<String, Object> good = new HashMap<String, Object>();
	 static Scanner scan=new Scanner(System.in);
	 static void newProduct() {
			System.out.println("請選擇產品名稱");
			System.out.print("1.cookie\n2.cake\n3.drink");
			int chooseP=scan.nextInt();
				switch(chooseP) {
				case 1:
					keyCookie();
				break; 
					
	 			case 2:
	 				keyCake();
	 			break; 

				case 3:
					keyDrinks();
				break; 
				
				}

	 }
	 static void keyCookie() {
		 System.out.println("請輸入廠商名稱");
		String name =scan.next();
		System.out.println("請輸入價格");
		int price =scan.nextInt();
		good.add(new cookie(name,price));
		 System.out.println("	要1.繼續還是2.離開？");
		 int keep=scan.nextInt();
		 if(keep==1) {
			 keyCookie();
		 }else {
			 System.out.println(good);
		 }
	 }
	 static void keyCake() {
		 System.out.println("請輸入廠商名稱");
		String name =scan.next();
		System.out.println("請輸入價格");
		int price =scan.nextInt();
		good.add(new cake(name,price));
		 System.out.println("	要1.繼續還是2.離開？");
		 int keep=scan.nextInt();
		 if(keep==1) {
			 keyCake();;
		 }else {
			 System.out.println(good);
		 }
	 }
	 static void keyDrinks() {
		 System.out.println("請輸入廠商名稱");
		String name =scan.next();
		System.out.println("請輸入價格");
		int price =scan.nextInt();
		good.add(new drink(name,price));
		 System.out.println("	要1.繼續還是2.離開？");
		 int keep=scan.nextInt();
		 if(keep==1) {
			 keyDrinks();
		 }else {
			 System.out.println(good);
		 }
	 }
	 static void replaceGood() {
		 for (int i =0;i<good.size();i++) {
				System.out.print("第"+i+"筆\t");
				System.out.println(good.get(i));
			}
		 System.out.println("請輸入要修改的資料數字");
		 int i =scan.nextInt();
		 System.out.println(good.get(i));
		 good.set(i, good);
		 
		 
	 }
	 
	 
	 
public static void main(String[] args) {	

	
	
}

}
