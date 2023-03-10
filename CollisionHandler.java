// CollisionHandler.java
public abstract class CollisionHandler {
    protected static CollisionHandler nextHandler;

    public CollisionHandler(CollisionHandler nextHandler) {
        CollisionHandler.nextHandler = nextHandler;
    }

    public static void handleCollision(Sprite sprites, Sprite sprites2) {
    	System.out.println("enter this collision");
    	if(match(sprites, sprites2)) {
    		doHandler(sprites, sprites2);
    	}else if(nextHandler != null) {
    		CollisionHandler.handleCollision(sprites, sprites2);
    	}
    };
    
    protected static boolean match(Sprite s1, Sprite s2) {
		// TODO Auto-generated method stub
		return false;
	}
    protected static void doHandler(Sprite s1, Sprite s2) {
		// TODO Auto-generated method stub
		
	}
}