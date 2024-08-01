class Queue{
	public static boolean accept(String sent)
	{
		System.out.println("start accept in Queue");
		boolean acceptMsg=ServiceProvider.send("name","msg");
		System.out.println("acceptMsg :"+acceptMsg);
		System.out.println("end accept in Queue");
		return true;
	}
}