package HW0814;

public class Land {
	java.util.Scanner scan=new java.util.Scanner(System.in);
	public void choose() {
		System.out.println("請選擇需要哪種車？");
		System.out.println("1.計程車2.大巴3.火車4.高鐵");
		int a=scan.nextInt();
		switch(a) {
		case 1:
			System.out.println("已為您叫好計程車");
			System.out.println("將回到主頁");
			choose();
			break;
		case 2:
			System.out.println("已為您叫好巴士");
			System.out.println("將回到主頁");
			choose();
			break;
		case 3:
			train train=new train();
			train.display();
			System.out.println("將回到主頁");
			choose();
			break;
		case 4:
			System.out.println("將回到主頁");
			choose();
			break;		
		}
		
		
		}
	
	

	
}

