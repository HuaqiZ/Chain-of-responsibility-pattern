
public class WaterFireHandler extends CollisionHandler {

	public WaterFireHandler(CollisionHandler next) { super(next); };
	
	protected boolean match(Sprite s1, Sprite s2) {
		if(s1 instanceof Water && s2 instanceof Fire) {
			return true;
		}else if(s1 instanceof Fire && s2 instanceof Water) {
			return true;
		}else {
			return false;
		}
	}
	
	protected void doHandler(Sprite s1, Sprite s2) {
		System.out.println(s1.symbol + s2.symbol);
		World.removeFromWorld(s1);
		World.removeFromWorld(s2);
	}
}
