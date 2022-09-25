package HW0828;

import java.util.HashMap;
import java.util.Scanner;

public class Staff {
		static Scanner scan=new Scanner(System.in);

	 	
		
			static void choose() {
				System.out.println("1.鍵入新產品");
				System.out.println("2.維護舊產品");
				System.out.println("3.看現在所有產品");
				int ch=scan.nextInt();
				if(ch==1) {
					goods.newProduct();
				}else if( ch==2) {
					System.out.println("舊產品");
				}else{
					System.out.println("輸入錯誤請重新輸入");
				}
			}
	
		public static void main(String[] args) {
			
			choose();			
		}

		
}
