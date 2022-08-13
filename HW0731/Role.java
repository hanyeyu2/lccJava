package HW0731;

public class Role {
	private String name;
	private int hp,level,mp;
	
	public Role(String man,int hp,int mp) {
		this.name=man;
		this.hp=hp;
		this.level=1;
		this.mp=mp;
	}
	public void fight() {
		System.out.println("角色攻擊");
	}
	public String getName() {
		return this.name;
	}
	public int getHp() {
		return this.hp;
	}
	public int getLevel() {
		return this.level;
	}
	public int getMp() {
		return this.mp;
	}
	
	public void setName() {
		this.name=name;
	}
	public void setHp() {
		this.hp=hp;
	}
	public void setMp() {
		this.mp=mp;
	}
	public void setLevel() {
		this.level=level;
	}
	
}
