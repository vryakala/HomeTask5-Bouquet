package bouquet;

public class Client {

	public static void main(String[] args) {
		Bouquet BouquetName = new Bouquet();
		BouquetName.Add(5, new Rose());
		BouquetName.Add(5, new Lilly());
		System.out.println("Cost of Bouquet is " + CostOfBouquet());
	}

	private static int CostOfBouquet() {
		int cost = 0;
		for (Flower flower : Bouquet.list) {
			cost = cost + flower.cost;
		}
		return cost;
	}
}
