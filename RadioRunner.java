 class RadioRunner{
	public static void main(String[] values){
		System.out.println("start main in RadioRunner");
		
		Radio radio=new Radio("darkRed","roundedRectangular");
		System.out.println("radio type:"+radio.type);
		System.out.println("radio color:"+radio.color);
		System.out.println("radio shape:"+radio.shape);
		radio.price=3500;
		System.out.println("radio price:"+radio.price);
		
		Radio radio1=new Radio("black","G");
		System.out.println("radio type:"+radio1.type);
		System.out.println("radio color:"+radio1.color);
		System.out.println("radio shape:"+radio1.shape);
		radio1.price=2360;
		System.out.println("radio price:"+radio1.price);
		System.out.println("end main in RadioRunner");
	}