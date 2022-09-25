package HW0814;

public interface Transportation {
	default void choose() {
		System.out.println("請選擇需要哪種交通工具？");
		System.out.println("1.陸2.海3.空");
		java.util.Scanner scan=new java.util.Scanner(System.in);
		int a=scan.nextInt();
		switch(a) {
		case 1:
			Land land=new Land();
			land.choose();
			break;
		case 2:
			System.out.println("請選擇需要哪種海運交通工具？");
			System.out.println("1.貨船2.客船");
			break;
		case 3:
			System.out.println("請選擇啟程地及目的地");
			break;
		default:
			System.out.println("無此選項請重新輸入，謝謝！！");
			choose();
			break;
	}
	}
	
}
