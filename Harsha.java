class Harsha{
	public static void drinkCoffee(double money,String name)
	{
		System.out.println("start drinkCoffee in Harsha");
		System.out.println("money :"+money);
		System.out.println("name :"+name);
		System.out.println("end drinkCoffee in Harsha");
		CoffeeBar.sellCoffee(name,money);
	}
}