class Email{
	public static void sendMessage(String message)
	{
		System.out.println("Start send message in Email");
		Person.read(message);
	    System.out.println("End send message in Email");

		
	}
	
}