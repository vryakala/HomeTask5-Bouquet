package bouquet;

import java.util.ArrayList;

public class Bouquet {
	// Creating flower object
	Flower Flower = new Flower();
	static ArrayList<Flower> list = new ArrayList<Flower>();

	public void Add(int n, Flower Flower) {
		for (int i = 0; i < n; i++) {
			list.add(Flower);
		}
		//System.out.println("Added " + n + " " + Flower.getClass() + " Flowers to Bouquet");
		//System.out.println(list);
	}

}
