class WatchRunner{
	public static void main(String[] values){
		System.out.println("start main in WatchRunner");
		Watch watch=new Watch("silver","round");
		System.out.println("watch brand:"+watch.brand);
		System.out.println("watch color:"+watch.color);
		System.out.println("watch shape:"+watch.shape);
		watch.size=35;
		System.out.println("watch size:"+watch.size);
		Watch watch1=new Watch("white","square");
		System.out.println("watch brand:"+watch1.brand);
		System.out.println("watch color:"+watch1.color);
		System.out.println("watch shape:"+watch1.shape);
		watch1.size=26;
		System.out.println("updated value watch size:"+watch1.size);
		System.out.println("end main in WatchRunner");
	}
	}