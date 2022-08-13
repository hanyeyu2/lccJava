package HW0807;
import java.util.Scanner;
public class HW0807_01 {
	
	public static int Fibonacci(int n) {
		if(n==1)
			return 1;
		else if(n==2)
			return 1;
		else
			return Fibonacci(n-1)+Fibonacci(n-2);
		
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("請輸入第幾個月，來顯示目前兔子總數");
		int m=scan.nextInt();
		for(int i =1;i<=m;i++) {
			System.out.print(Fibonacci(i+1)+"/"+Fibonacci(i)+",");
		}
		
		
		
	}
	
}
