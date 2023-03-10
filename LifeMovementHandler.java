
public class LifeMovementHandler {
	public static boolean moveResult(String x1, String x2) {
		if (x1 == "0" && x2 == "0") {
			return true;
		} else if (x1 == "0" || x2 == "0") {
			return true;
		} else {
			return false;
		}
	}
}
