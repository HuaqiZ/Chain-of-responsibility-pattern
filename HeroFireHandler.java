
public class HeroFireHandler extends CollisionHandler {

	public HeroFireHandler(CollisionHandler next) { super(next); };
	
	protected static boolean match(Sprite s1, Sprite s2) {
		if(s1 instanceof Hero && s2  instanceof Fire) {
			return true;
		}else if(s1 instanceof Fire && s2 instanceof Hero) {
			return true;
		}else {
			return false;
		}
	}
	
	protected static void doHandler(Sprite s1, Sprite s2) {
		//two condition:
//		hero hp -10
//		fire remove
//		if c1 hero, move success
//		if not, move fail
	}
}
