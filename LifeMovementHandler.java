
public class LifeMovementHandler {
	public static boolean moveResult(Sprite c1, Sprite c2) {
		if (c1 == null && c2 == null) {
			return true;
		} else if (c1 == null || c2 == null) {
			return true;
		} else {
			return false;
		}
	}
}
