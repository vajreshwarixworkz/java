class Hotel1{
	public static String getitem(String getitem)
	{
		System.out.println("start getitem in Hotel1");
		Swiggy.order(getitem);
		System.out.println("end getitem in Hotel1");
		return "30";
	}
}