public abstract class CollisionHandler {
    protected CollisionHandler nextHandler;

    public CollisionHandler(CollisionHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleCollision(Sprite sprites, Sprite sprites2) {
    	if(sprites.symbol == sprites2.symbol) {
    		System.out.println("move fail, same type");
    	}else if(match(sprites, sprites2)) {
    		doHandler(sprites, sprites2);
    	}else if(nextHandler != null) {
    		nextHandler.handleCollision(sprites, sprites2);
    	}
    };
    
    protected abstract boolean match(Sprite s1, Sprite s2);
    protected abstract void doHandler(Sprite s1, Sprite s2);
}