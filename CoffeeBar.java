class CoffeeBar{
	public static void sellCoffee(String name,double cost)
	{
		System.out.println("start sellCoffee in CoffeeBar");
		System.out.println("name :"+name);
		System.out.println("cost :"+cost);
		System.out.println("end sellCoffee in CoffeeBar");
		Staff.makeCoffee(name,cost);
	}
}