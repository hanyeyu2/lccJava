package HW0731;
public class Game {
	public static void main(String[] main) {
		java.util.Scanner scan=new java.util.Scanner(System.in);
		System.out.println("請輸入武士的姓名");
		String man1=scan.next();
		System.out.println("請輸入舞者的姓名");
		String man2=scan.next();
		
		
		Warrior wa =new Warrior(man1,100,500);
		Dancer da =new Dancer(man2,100,650);
		int whp=wa.getHp();
		int dhp=da.getHp();
		while(whp>0&&dhp>0) {
				int fight=(int)(Math.random()*120)+1;
				switch(fight%6){
				case 0:
					wa.attack();
					dhp-=10;
					System.out.printf("武士攻擊\t敵方血量-10\n");
					System.out.printf("武士血量%d\tVS\t舞者血量%d\n",whp,dhp);
					break;
				case 1:
					wa.deathblow();
					dhp-=30;
					System.out.printf("武士攻擊\t敵方血量-30\n");
					System.out.printf("武士血量%d\tVS\t舞者血量%d\n",whp,dhp);
					break;
				case 2:
					wa.fight();
					dhp-=20;
					System.out.printf("武士攻擊\t敵方血量-20\n");
					System.out.printf("武士血量%d\tVS\t舞者血量%d\n",whp,dhp);
					break;
				case 3:
					da.cure();
					dhp+=5;
					System.out.printf("舞者補血\t增加血量+10\n");
					System.out.printf("武士血量%d\tVS\t舞者血量%d\n",whp,dhp);
					break;
				case 4:
					da.fight();
					whp-=15;
					System.out.printf("舞者攻擊\t敵方血量-15\n");
					System.out.printf("武士血量%d\tVS\t舞者血量%d\n",whp,dhp);
					break;
				case 5:
					da.deathblow();
					whp-=35;
					System.out.printf("舞者攻擊\t敵方血量-35\n");
					System.out.printf("武士血量%d\tVS\t舞者血量%d\n",whp,dhp);
					break;
				
			}
				
		}
		if(dhp<=0) {
			System.out.println("武士勝利");
		}else {
			System.out.println("舞者勝利");
		}
		
	}
	
}
