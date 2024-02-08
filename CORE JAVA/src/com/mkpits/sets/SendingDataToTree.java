package com.mkpits.sets;


public class SendingDataToTree {

	public static void main(String[] args) {

		TreeSets drinks = new TreeSets("Drinks");
		TreeSets hot = new TreeSets("Hot");
		TreeSets cold = new TreeSets("Cold");
		TreeSets snacks = new TreeSets("Snacks");

		// Adding data to Hot list
		TreeSets tea = new TreeSets("Tea");
		TreeSets coffee = new TreeSets("Coffee");
		TreeSets soup = new TreeSets("Soup");
		TreeSets greenTea = new TreeSets("Green Tea");

		// Adding data to cold list
		TreeSets wine = new TreeSets("Wine");
		TreeSets coldCoffee = new TreeSets("Cold Coffee");
		TreeSets beer = new TreeSets("Beer");
		TreeSets pepsi = new TreeSets("Pepsi");

		// Adding data to snacks list
		TreeSets kurkure = new TreeSets("Kurkure");
		TreeSets chips = new TreeSets("Chips");
		TreeSets soya = new TreeSets("Soya");
		TreeSets papdi = new TreeSets("Papdi");

		drinks.addChild(hot);
		drinks.addChild(cold);
		drinks.addChild(snacks);

		hot.addChild(tea);
		hot.addChild(coffee);
		hot.addChild(soup);
		hot.addChild(greenTea);

		cold.addChild(wine);
		cold.addChild(coldCoffee);
		cold.addChild(beer);
		cold.addChild(pepsi);

		snacks.addChild(kurkure);
		snacks.addChild(chips);
		snacks.addChild(soya);
		snacks.addChild(papdi);
		System.out.println(drinks.print(0));
	}

}
