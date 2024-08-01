class Syringe{
	int length=65;
	String type;
	String brand;
	double price;
	Syringe(String typeLocal,String brandLocal)
	{
		type=typeLocal;
		brand=brandLocal;
		System.out.println("craeated syringe using string constructor");
	}