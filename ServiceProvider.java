class ServiceProvider{
	public static boolean send(String name,String msg)
	{
		System.out.println("start send in ServiceProvider");
		boolean sendName=MessageProvider.send("name","msg");
		System.out.println("sendName :"+sendName);
		System.out.println("end send in ServiceProvider");
		return true;
	}
}