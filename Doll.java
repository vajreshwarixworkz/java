class Doll{
	public static void sendGift(String name,int price,String date,boolean urgent)
	{
		System.out.println("start sendGift in doll");
		System.out.println("name :"+name);
		System.out.println("price :"+price);
		System.out.println("date :"+date);
		System.out.println("urgent :"+urgent);
		IceCream.assign(name,price,date,urgent);
        System.out.println("end sendGift in doll");
	}
}