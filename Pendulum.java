class Pendulum{
	String type="simple";
	String shape;
	String color;
	double price;
	Pendulum(String shapeLocal,String colorLocal)
	{
		shape=shapeLocal;
		color=colorLocal;
		System.out.println("created Pendulum using string constructor");
	}
}