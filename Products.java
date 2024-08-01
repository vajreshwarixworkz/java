class Products{
	public static String name()
	{
		String productName="cosmatics";
				System.out.println(productName);//

		return productName;
	}
	public static  double price(){
		double productprice=145.6;
		System.out.println(productprice);
		return productprice;
	}
	public static int quantity()
	{
		int productQuantity=8;
		System.out.println(productQuantity);
		return productQuantity;
	}
	public static String quality()
	{
		String productQuality="High";
		System.out.println(productQuality);
		return productQuality;
	}
	public static String manufactureDate()
	{
		String productManufacturedate="24-6-2024";
		System.out.println(productManufacturedate);
		return productManufacturedate;
	}
	public static String brand()
	{
		String productBrand="Lakme";
		System.out.println(productBrand);
		return productBrand;
	}
	public static void main(String[] args){
		Products.name();
		Products.price();
	    Products.quantity();
		Products.quality();
		Products.manufactureDate();
		Products.brand();
	}
	
}
