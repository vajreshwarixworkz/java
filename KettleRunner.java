class KettleRunner{
	public static void main(String[] value){
		System.out.println("start main in KettleRunner");
		
		Kettle kettle=new Kettle();
		kettle.material="steel";
		kettle.type="electric";
		System.out.println("material:"+kettle.material);
		System.out.println("type:"+kettle.type);
		
		Kettle kettle1=new Kettle();
		kettle1.material="copper";
		kettle1.type="stovetop";
		System.out.println("material:"+kettle1.material);
		System.out.println("type:"+kettle1.type);
		
		Kettle kettle2=new Kettle();
		kettle2.material="brass";
		kettle2.type="gooseneckTea";
		System.out.println("material:"+kettle2.material);
		System.out.println("type:"+kettle2.type);
		
		Kettle kettle3=new Kettle();
		kettle3.material="nickel";
		kettle3.type="electric";
		System.out.println("material:"+kettle3.material);
		System.out.println("type:"+kettle3.type);
		
		Kettle kettle4=new Kettle();
		kettle4.material="ref1";
		kettle4.type="ref1";
		System.out.println("material:"+kettle4.material);
		System.out.println("type:"+kettle4.type);
		
		Kettle kettle5=new Kettle();
		kettle5.material="ref1";
		kettle5.type="ref1";
		System.out.println("material:"+kettle5.material);
		System.out.println("type:"+kettle5.type);
		
		Kettle kettle6=new Kettle();
		kettle6.material="ref1";
		kettle6.type="ref1";
		System.out.println("material:"+kettle6.material);
		System.out.println("type:"+kettle6.type);
		System.out.println("end main in KettleRunner");
	}
}