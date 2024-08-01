 class TrumpetRunner{
	public static void main(String[] args){
		System.out.println("start main in TrumpetRunner");
		
		Trumpet trumpet=new Trumpet("yamaha","silver");
		System.out.println("trumpet type:"+trumpet.type);
		System.out.println("trumpet brand:"+trumpet.brand);
		System.out.println("trumpet color:"+trumpet.color);
		trumpet.price=2340;
		System.out.println("trumpet price:"+trumpet.price);
		
		Trumpet trumpet1=new Trumpet("adams","green");
		System.out.println("trumpet type:"+trumpet1.type);
		System.out.println("trumpet brand:"+trumpet1.brand);
		System.out.println("trumpet color:"+trumpet1.color);
		trumpet1.price=1590;
		System.out.println("trumpet price:"+trumpet1.price);
		System.out.println("end main in TrumpetRunner");
	}
 }