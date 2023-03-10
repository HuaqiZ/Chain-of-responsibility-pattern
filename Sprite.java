// Sprite.java
public abstract class Sprite {
	protected int position; // 坐标位置
	protected int HP; // 生命值
	protected char symbol; // 生命种类

	public abstract void move(int newPosition); // 移动方法

	// Getter 和 Setter 方法省略
	public void getHP(int hp) {
		this.HP = hp;
	}

	public void setHP(int hp) {
		this.HP = hp;
	}
}
