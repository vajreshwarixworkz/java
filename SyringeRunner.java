 class SyringeRunner{
	public static void main(String[] args){
		System.out.println("start main in SyringeRunner");
		
		Syringe syringe=new Syringe("tuberculin","lifelongGroup");
		System.out.println("syringe length:"+syringe.length);
		System.out.println("syringe type:"+syringe.type);
		System.out.println("syringe brand:"+syringe.brand);
		syringe.price=120;
		System.out.println("syringe price:"+syringe.price);
		
		Syringe syringe1=new Syringe("venomExtraction","BDIndiaPvt");
		System.out.println("syringe length:"+syringe1.length);
		System.out.println("syringe type:"+syringe1.type);
		System.out.println("syringe brand:"+syringe1.brand);
		syringe1.price=620;
		System.out.println("syringe price:"+syringe1.price);
		System.out.println("end main in SyringeRunner");
	}
 }