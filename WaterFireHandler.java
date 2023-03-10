
public class WaterFireHandler extends CollisionHandler {

	public WaterFireHandler(CollisionHandler next) { super(next); };
	
	protected static boolean match(Sprite s1, Sprite s2) {
		if(s1 instanceof Water && s2 instanceof Fire) {
			return true;
		}else if(s1 instanceof Fire && s2 instanceof Water) {
			return true;
		}else {
			return false;
		}
	}
	
	protected static void doHandler(Sprite s1, Sprite s2) {
		//remove water and remove fire, s1/s2
	}
}
