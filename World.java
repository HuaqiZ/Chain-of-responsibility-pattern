import java.util.*;

public class World {
	public static void main(String args[]) {
		Random rand = new Random();
		@SuppressWarnings("resource")
		Scanner readme = new Scanner(System.in);
		int numSprites = 10;

        // 定义一个列表，用于存储所有的 Sprite 对象，包括空地
		Sprite[] sprites = new Sprite[numSprites + 5]; // 假设数组长度比 numSprites 大 5

        // 定义一个集合，用于存储已经选择的位置
        Set<Integer> chosenPositions = new HashSet<>();

        // 随机放置 Sprite 对象
        for (int i = 0; i < numSprites; i++) {
            // 随机选择一个位置，直到选择到一个未被选择过的位置为止
            int position;
            do {
                position = rand.nextInt(numSprites + 5);
            } while (chosenPositions.contains(position));
            chosenPositions.add(position);

            // 随机生成一个 Sprite 类型
            int spriteType = rand.nextInt(3);

            // 根据 Sprite 类型创建对象，并将其放置到数组中的对应位置
            if (spriteType == 0) {
                sprites[position] = new Water();
            } else if (spriteType == 1) {
                sprites[position] = new Fire();
            } else {
                sprites[position] = new Hero();
            }
        }
        
        System.out.println(Arrays.toString(sprites));

		while (true) {
			System.out.println();
			System.out.println("please enter two location to move the sprite");

			int x1, x2;
			x1 = readme.nextInt();
			x2 = readme.nextInt();
			// need a check input checker

			if (!LifeMovementHandler.moveResult(sprites[x1], sprites[x2])) {
				sprites[x2] = sprites[x1];
				sprites[x1] = null;
				System.out.println("move successfully");
				System.out.println(Arrays.toString(sprites));
			} else {
				handle(sprites[x1], sprites[x2]);
				System.out.println("move fail");
			}
		}
	}
	public static void handle(Sprite c1, Sprite c2) {
		CollisionHandler.handleCollision(c1, c2);
	}
}