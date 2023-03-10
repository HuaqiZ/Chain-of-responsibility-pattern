import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class World {
	public static void main(String args[]) {
		Random random = new Random();
		String[] arr = new String[30];
		String sprite = "HWF0";

		for (int i = 0; i < arr.length; i++) {
			String spriteName = String.valueOf(sprite.charAt(random.nextInt(sprite.length())));
			arr[i] = spriteName;
		}
		System.out.println(Arrays.toString(arr));

		while (true) {
			@SuppressWarnings("resource")
			Scanner readme = new Scanner(System.in);
			System.out.println();
			System.out.println("please enter two location to move the sprite");
			if (readme.next().equals("q")) {
				System.out.println("Game over");
				break;
			}
			int x1, x2;
			x1 = readme.nextInt();
			x2 = readme.nextInt();
			// need a check input checker

			if (!LifeMovementHandler.moveResult(arr[x1], arr[x2])) {
				arr[x2] = arr[x1];
				arr[x1] = "0";
				System.out.println("move successfully");
				System.out.println(Arrays.toString(arr));
			} else {
				// enter collisionHandler
				System.out.println("move fail");
			}
		}

	}
}