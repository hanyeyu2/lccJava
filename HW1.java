
public class HW1 {
	public static void main(String[] args) {
		java.util.Scanner scan =new java.util.Scanner(System.in);
		
		System.out.print("請輸入數字");
		int number = scan.nextInt();
		
		if(number%2==0) {
			//若為單一行可省略大括弧
			System.out.println(number+"為偶數");
		}else {
			System.out.println(number+"為奇數");
		}
	}
}
