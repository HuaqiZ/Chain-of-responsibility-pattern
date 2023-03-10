// CollisionHandler.java
public abstract class CollisionHandler {
    protected CollisionHandler nextHandler;

    public CollisionHandler setNextHandler(CollisionHandler nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler;
    }

    public abstract void handleCollision(Sprite s1, Sprite s2);
}