class IceCream{
	public static void assign(String name,int price,String date,boolean urgent )
	{
		System.out.println("start assign in IceCream");
		System.out.println("name :"+name);
		System.out.println("price :"+price);
		System.out.println("date :"+date);
		System.out.println("urgent :"+urgent);
        System.out.println("end assign in IceCream");
		Pizza.deliver(name,date,urgent);
	}
}