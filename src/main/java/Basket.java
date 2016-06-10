package main.java;

interface Item {

	public double itemCost();
}

class Fruit implements Item {
	private int pricePerKg;
	private String name;
	private int weight;

	public Fruit(int pricePerKg, int weight, String name) {
		this.pricePerKg = pricePerKg;
		this.weight = weight;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getWeight() {
		return weight;
	}

	public int getPricePerKg() {
		return pricePerKg;
	}

	@Override
	public double itemCost() {
		// TODO Auto-generated method stub
		return (pricePerKg * weight);
	}

}

public class Basket {

	public static void main(String args[]) {
    
	
		Item[] item = createBasket();
		double cost = basketTotalCost(item);
		System.out.println("Total Cost---" + cost);

	}
	
	public static Item[] createBasket(){
		//Hardcoded here. We can also read it from the flat file.
		Item[] item = new Item[] { new Fruit(2, 1, "Bananas"),
				new Fruit(2, 1, "Bananas"), new Fruit(2, 1, "Peaches"),
				new Fruit(2, 1, "Lemons"), new Fruit(2, 2, "Oranges") };
		
		return item;
		
	}

	public static double basketTotalCost(Item[] item) {
		double cost = 0.0;
		for (Item iteminBasket : item) {
			cost = cost + iteminBasket.itemCost();

		}
		return cost;
	}
}