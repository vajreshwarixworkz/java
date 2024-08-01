class InjectionRunner{
	public static void main(String[] value){
		System.out.println("start main in InjectionRunner");
		
		Injection ref=new Injection();
		ref.color="whitish";
		ref.type="intravenous";
		System.out.println("color:"+ref.color);
		System.out.println("type:"+ref.type);
		
		Injection ref1=new Injection();
		ref1.color="clear";
		ref1.type="intramuscular";
		System.out.println("color:"+ref1.color);
		System.out.println("type:"+ref1.type);
		
		Injection ref2=new Injection();
		ref2.color="red";
		ref2.type="subcutaneous";
		System.out.println("color:"+ref2.color);
		System.out.println("type:"+ref2.type);
		
		Injection ref3=new Injection();
		ref3.color="green";
		ref3.type="intradermal";
		System.out.println("color:"+ref3.color);
		System.out.println("type:"+ref3.type);
		
		Injection ref4=new Injection();
		ref4.color="ref";
		ref4.type="ref";
		System.out.println("color:"+ref4.color);
		System.out.println("type:"+ref4.type);
		
		Injection ref5=new Injection();
		ref5.color="ref";
		ref5.type="ref";
		System.out.println("color:"+ref5.color);
		System.out.println("type:"+ref5.type);
		
		Injection ref6=new Injection();
		ref6.color="ref";
		ref6.type="ref";
		System.out.println("color:"+ref6.color);
		System.out.println("type:"+ref6.type);
		System.out.println("end main in InjectionRunner");
	}
} 