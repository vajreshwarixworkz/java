 class MicroScopeRunner{
	public static void main(String[] value){
		System.out.println("start main in MicroScopeRunner");
		
		MicroScope ref=new MicroScope();
		ref.type="simple";
		ref.size=250nm;
		System.out.println("type:"+ref.type);
		System.out.println("size:"+ref.size);
		
		MicroScope ref1=new MicroScope();
		ref1.type="compound";
		ref1.size=450nm;
		System.out.println("type:"+ref1.type);
		System.out.println("size:"+ref1.size);
		
		MicroScope ref2=new MicroScope();
		ref2.type="electron";
		ref2.size=700nm;
		System.out.println("type:"+ref2.type);
		System.out.println("size:"+ref2.size);
		
		MicroScope ref3=new MicroScope();
		ref3.type="scanningProbe";
		ref3.size=550nm;
		System.out.println("type:"+ref3.type);
		System.out.println("size:"+ref3.size);
		
		MicroScope ref4=new MicroScope();
		ref4.type="ref1";
		ref4.size=ref1;
		System.out.println("type:"+ref4.type);
		System.out.println("size:"+ref4.size);
		
		MicroScope ref5=new MicroScope();
		ref5.type="ref1";
		ref5.size=ref1;
		System.out.println("type:"+ref5.type);
		System.out.println("size:"+ref5.size);
		
		MicroScope ref6=new MicroScope();
		ref6.type="ref1";
		ref6.size=ref1;
		System.out.println("type:"+ref6.type);
		System.out.println("size:"+ref6.size);
		System.out.println("end main in MicroScopeRunner");
	}
 }