 class cable{
	String type="coaxialCable";
	int length;
	double price;
	String shape;
	Cable(double priceLocal,String shapeLocal)
	{
		price=priceLocal;
		shape=shapeLocal;
		System.out.println("created Cable using double and string contructor");
	}
 }