package practice10;

public class Car {
	int serialNo;
	String color;
	int gasoline;

	int run() {
		if (gasoline > 0) {
			int go = new java.util.Random().nextInt(15) + 1;
			gasoline -= 1;
			return go;
		} else {
			return -1;
		}
	}
}
