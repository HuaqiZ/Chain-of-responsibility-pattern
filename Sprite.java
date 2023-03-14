// Sprite.java
public abstract class Sprite {
	protected int HP;
	protected String symbol;
	protected int position;

	public int getHP() {
		return HP;
	}

	public void setHP(int hp) {
		if(hp > 50) {
			System.out.println("Max HP is 50");
		}else {
			this.HP = hp;
		}
	}
	
	public void setPostion(int position) {
		this.position = position;
	}
}
