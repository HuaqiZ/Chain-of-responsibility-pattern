import java.util.*;

public class World {
	static int numSprites = 30;
	private static Sprite[] sprites = new Sprite[numSprites + 5];

	public static void main(String args[]) {
		Random rand = new Random();
		@SuppressWarnings("resource")
		Scanner readme = new Scanner(System.in);

        Set<Integer> chosenPositions = new HashSet<>();

        // 随机放置 Sprite 对象
        for (int i = 0; i < numSprites; i++) {
            int position;
            do {
                position = rand.nextInt(numSprites + 5);
            } while (chosenPositions.contains(position));
            chosenPositions.add(position);

            int spriteType = rand.nextInt(3);

            if (spriteType == 0) {
            	var water = new Water();
            	water.setPostion(position);
                sprites[position] = water;
            } else if (spriteType == 1) {
            	var fire = new Fire();
            	fire.setPostion(position);
                sprites[position] = fire;
            } else {
            	var hero = new Hero();
            	hero.setPostion(position);
            	hero.setHP(50);
                sprites[position] = hero;
            }
        }
        
        showSprite();

		while (true) {
			System.out.println();
			System.out.println("please enter two location to move the sprite");

			int x1, x2;
			x1 = readme.nextInt();
			x2 = readme.nextInt();
			
			if(x1 >= numSprites || x2 >= numSprites) {
				System.out.println("Please re-enter valid number");
			}else {
				move(x1, x2);
			}
		}
	}
	public static void move(int x1, int x2) {
		if (LifeMovementHandler.moveResult(sprites[x1], sprites[x2])) {
			sprites[x2] = sprites[x1];
			sprites[x1] = null;
			System.out.println("move successfully");
			showSprite();
		} else {
			var handle = new HeroFireHandler(
	                new HeroWaterHandler(new WaterFireHandler(null)));
			handle.handleCollision(sprites[x1], sprites[x2]);
			showSprite();
		}
	}

	public static void removeFromWorld(Sprite s) {
		System.out.println(s.symbol + " is removed from the world");
		sprites[s.position] = null;
	}
	
	public static void showSprite() {
		for(int i = 0; i < numSprites; i++) {
			if(sprites[i] == null) {
				System.out.print(sprites[i] + " ");
			}else {
				System.out.print(sprites[i].symbol + " ");
			}
		}
	}
}