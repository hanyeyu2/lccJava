package HW0807;
import java.util.Scanner;
public class HW0807_02 extends HW0807_01 {
	
	public static double Fibonacci02(int n) {
		return(double) Fibonacci(n+1)/Fibonacci(n);
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.print("請輸入欲求項次總和");
		int m =scan.nextInt();
		double total = 0;
		for(int i=1;i<=m+1;i++){
			total += Fibonacci02(i);
		}	
		System.out.println(total);
	}
}
