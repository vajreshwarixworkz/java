 class HormonicaRunner{
	public static void main(String[] values){
		System.out.println("start main in HormonicaRunner");
		
		Hormonica hormonica=new Hormonica("diatonic","rectangular");
		System.out.println("hormonica size:"+hormonica.size);
		System.out.println("hormonica type:"+hormonica.type);
		System.out.println("hormonica shape:"+hormonica.shape);
		hormonica.price=500;
		System.out.println("hormonica price:"+hormonica.price);
		
		Hormonica hormonica1=new Hormonica("octave","square");
		System.out.println("hormonica size:"+hormonica1.size);
		System.out.println("hormonica type:"+hormonica1.type);
		System.out.println("hormonica shape:"+hormonica1.shape);
		hormonica1.price=480;
		System.out.println("hormonica price:"+hormonica1.price);
		System.out.println("end main in HormonicaRunner");
	}
 }