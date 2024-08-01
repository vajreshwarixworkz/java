class Laptops{
	public static void connect(int speed){
	System.out.println("Start send message in Laptop");
	Router.network(speed);
	Provider.provide(speed);
	System.out.println("End send message in Laptop");


	}
}