class CableRunner{
	public static void main(String[] values){
		System.out.println("start main in CableRunner");
		Cable cable=new Cable(30,"circular");
		System.out.println("cable type:"+cable.type);
		cable.length=4;
		System.out.println("cable length:"+cable.length);
		System.out.println("cable price:"+cable.price);
		System.out.println("cable shape:"+cable.shape);
		
		Cable cable1=new Cable(50,"semiCircular");
		System.out.println("cable type:"+cable1.type);
		cable1.length=7;
		System.out.println("cable length:"+cable1.length);
		System.out.println("cable price:"+cable1.price);
		System.out.println("cable shape:"+cable1.shape);
		System.out.println("end main in CableRunner");
	}