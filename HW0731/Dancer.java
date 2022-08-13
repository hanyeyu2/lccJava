package HW0731;


public class Dancer extends Role {
	
	public Dancer(String man,int hp,int mp) {
		super(man,hp,mp);
	}
	
	public void fight() {
		System.out.println("迴旋踢攻擊");
	}
	public void cure() {
		System.out.println("補血功能！！！");
	}
	/*public void encourage() {
		System.out.println("鼓舞軍心！！！");
	}*/
	public void deathblow() {
		System.out.println("天女散花");
	}
}
