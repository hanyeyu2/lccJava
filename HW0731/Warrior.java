package HW0731;

public class Warrior extends Role {
	
	public Warrior(String man,int hp,int mp) {
		super(man,hp,mp);
	}
	
	public void fight() {
		System.out.println("三十六煩惱鳳");
	}
	
	public void deathblow() {
		System.out.println("衝衝鬼千刀");
	}
	public void attack() {
		System.out.println("加強攻擊");
	}
	
}
