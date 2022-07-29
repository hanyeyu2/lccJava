package HW0724;
public class HW01 {
	public static void main(String[] args) {
		//建立陣列
		int [] num={10,20,30,40,50,60,70,80,90,100};
		//
		java.util.Scanner scan=new java.util.Scanner(System.in);
		System.out.print("請輸入數字");
		int guess=scan.nextInt();
		int tot=0;
		for(int i=0;i<num.length;i++) {
			if(num[i]==guess){
			System.out.println("此數值的索引值為："+i);
			tot=i+1;}	
		}
		if(tot==0) {
			System.out.println("陣列中沒有此數字");
		}
		
		
		
	}
}
