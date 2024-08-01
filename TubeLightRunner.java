 class TubeLightRunner{
	public static void main(String[] value){
		System.out.println("start main in TubeLightRunner");
		
		TubeLight ref=new TubeLight();
		ref.brand="philips";
		ref.color="white";
		System.out.println("brand:"+ref.brand);
		System.out.println("color:"+ref.color);
		
		TubeLight ref1=new TubeLight();
		ref1.brand="vorlane";
		ref1.color="pink";
		System.out.println("brand:"+ref1.brand);
		System.out.println("color:"+ref1.color);
		
		TubeLight ref2=new TubeLight();
		ref2.brand="havells";
		ref2.color="syskaLed";
		System.out.println("brand:"+ref2.brand);
		System.out.println("color:"+ref2.color);
		
		TubeLight ref3=new TubeLight();
		ref3.brand="syska";
		ref3.color="red";
		System.out.println("brand:"+ref3.brand);
		System.out.println("color:"+ref3.color);
		
		TubeLight ref4=new TubeLight();
		ref4.brand="ref1";
		ref4.color="ref1";
		System.out.println("brand:"+ref4.brand);
		System.out.println("color:"+ref4.color);
		
		TubeLight ref5=new TubeLight();
		ref5.brand="ref1";
		ref5.color="ref1";
		System.out.println("default value:"+ref5.brand);
		System.out.println("default value:"+ref5.color);
		
		TubeLight ref6=new TubeLight();
		ref6.brand="philips";
		ref6.color="white";
		System.out.println("updated value:"+ref6.brand);
		System.out.println("updated value:"+ref6.color);
		System.out.println("end main in TubeLightRunner");
	}
 }