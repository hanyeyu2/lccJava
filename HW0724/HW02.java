package HW0724;

public class HW02 {
	public static void main(String[] args) {
		int[] num= {20,10,30,15,5,35,50,40,45,60};
		for(int i:num) {
			System.out.print(i+",");
		}
		int tra;
		//小到大
		for(int i=0;i<num.length;i++) {
			for(int x=1;x<=num.length-1;x++)
					{if(num[x-1]>num[x]) {
						tra=num[x-1];
						num[x-1]=num[x];
						num[x]=tra;
						}
					}
		}
		System.out.println();
		System.out.println("由大至小排序");
		for(int i:num) {
			System.out.print(i+",");
		}
		//大到小
		for(int i=0;i<num.length;i++) {
			for(int x=1;x<=num.length-1;x++)
					{if(num[x-1]<num[x]) {
						tra=num[x-1];
						num[x-1]=num[x];
						num[x]=tra;
						}
					}
		}
		System.out.println();
		System.out.println("由小至大排序");
		for(int i:num) {
			System.out.print(i+",");
		}
	}
}
