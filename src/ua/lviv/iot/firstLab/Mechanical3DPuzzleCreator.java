package ua.lviv.iot.firstLab;

public class Mechanical3DPuzzleCreator {
	public static void main(String[] args) {
		Mechanical3DPuzzle carPazzle = new Mechanical3DPuzzle(500, 12, "wood", "car", "black", 499.99, 300, "10+",
				"Car which can move.");
		Mechanical3DPuzzle strongboxPazzle = new Mechanical3DPuzzle(440, 24, "wood", "strongbox");
		Mechanical3DPuzzle gunPazzle = new Mechanical3DPuzzle();
		System.out.println("_______________CAR_PUZZLE_______________");
		System.out.println(carPazzle.toString());
		System.out.println("_______________STRONGBOX_PUZZLE_______________");
		System.out.println(strongboxPazzle.toString());
		System.out.println("_______________GUN_PUZZLE_______________");
		System.out.println(gunPazzle.toString());
		System.out.println("_______________CLIENT_ID_______________");
		Mechanical3DPuzzle.printStaticId();
		Mechanical3DPuzzle[] trainPuzzles = new Mechanical3DPuzzle[4];
		for (int i = 0; i <= 3; ++i) {
			Mechanical3DPuzzle trainPuzzle = new Mechanical3DPuzzle(320 + 5 * i, 12, "wood", "train", "wooden",
					310 + 2 * i, 310 + 3 * i, "13+", "Train which can move on rails.");
			trainPuzzles[i] = trainPuzzle;
			
		}
		for (Mechanical3DPuzzle trainPuzzle1 :  trainPuzzles) {
			System.out.println("_______________TRAIN_PUZZLE_______________");
			System.out.println(trainPuzzle1);
			
		}
	}
}

