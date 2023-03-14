
public class HeroWaterHandler extends CollisionHandler {

	public HeroWaterHandler(CollisionHandler next) { super(next); };
	
	protected boolean match(Sprite s1, Sprite s2) {
		if(s1 instanceof Hero && s2 instanceof Water) {
			return true;
		}else if(s1 instanceof Water && s2 instanceof Hero) {
			return true;
		}else {
			return false;
		}
	}
	
	protected void doHandler(Sprite s1, Sprite s2) {
		System.out.println(s1.symbol + s2.symbol);
		if(s1 instanceof Hero && s2 instanceof Water) {
			var hp = s1.getHP();
			s1.setHP(hp + 10);
			System.out.println("Hero hp + 10");
			System.out.println(); 
			World.removeFromWorld(s2);
			World.move(s1.position, s2.position);
		}else {
			var hp = s2.getHP();
			s1.setHP(hp + 10);
			System.out.print("Hero hp + 10");
			System.out.println(); 
			World.removeFromWorld(s1);
			System.out.println("move fail");
		}
	}
}
