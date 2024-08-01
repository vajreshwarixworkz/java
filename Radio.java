class Radio{
	String type="shortWave";
	String color;
	String shape;
	double price;
	Radio(String colorLocal,String shapeLocal)
	{
		color=colorLocal;
		shape=shapeLocal;
		System.out.println("created radio using String constructor");
	}