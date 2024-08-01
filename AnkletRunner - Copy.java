class AnkletRunner{
	public static void main(String[] args){
		System.out.println("start main in AnkletRunner");
		
		Anklet anklet=new Anklet("flexible","mahavir");
		System.out.println("anklet length:"+anklet.length);
		System.out.println("anklet type:"+anklet.type);
		System.out.println("anklet brand:"+anklet.brand);
		anklet.price=1800;
		System.out.println("anklet price:"+anklet.price);
		
		Anklet anklet1=new Anklet("inflexible","shreejee");
		System.out.println("anklet length:"+anklet1.length);
		System.out.println("anklet type:"+anklet1.type);
		System.out.println("anklet brand:"+anklet1.brand);
		anklet1.price=4500;
		System.out.println("anklet price:"+anklet1.price);
		System.out.println("end main in AnkletRunner");
	}
}