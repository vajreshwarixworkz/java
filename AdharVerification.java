class AdharVerification{
	public static void verify(long adharNo)
	{
		System.out.println("running verify in AdharVerification");
		if(adharNo >=10 && adharNo<30)
		{
			System.out.println("verified adharno");
		}
		else
		{
			System.out.println("notverified adharno");
		}
	}
	public static void main(String[] args) {
        System.out.println("start main in Product");
        verify(894526725524L);
        System.out.println("end main in Product");
}
}