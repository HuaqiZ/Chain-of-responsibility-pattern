
public class HeroWaterHandler extends CollisionHandler {

	public HeroWaterHandler(CollisionHandler next) { super(next); };
	
	protected static boolean match(Sprite s1, Sprite s2) {
		if(s1 instanceof Hero && s2 instanceof Water) {
			return true;
		}else if(s1 instanceof Water && s2 instanceof Hero) {
			return true;
		}else {
			return false;
		}
	}
	
	protected static void doHandler(Sprite s1, Sprite s2) {
//		hero hp +10
//		water remove
//		if c1 hero, move success
//		if not, move fail
	}
}
