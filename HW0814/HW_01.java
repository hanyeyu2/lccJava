package HW0814;
/**
 * 
  請用介面 定義 交通工具 (載客)

  火車 、飛機、計程車 class

  火車、飛機、計程車 除了載客之外，還有那些功能

  請寫一個主程式來顯示三個交通工具的特色s
 * @author merci
 */
public class HW_01  implements Transportation{
	
	public void choose() {
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
	
	
	
	
	
	public static void main(String[] args) {
		
		
		
	}

}
