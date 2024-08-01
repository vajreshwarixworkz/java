class BusNos{
	public static void main(String[] args)
	{
		System.out.println("start main in BusNo");
		String busNo1="504";
		String busNo2="804";
		String busNo3="783";
		String busNo4="234";
		String busNo5="893";
		String[] busNos={busNo1,busNo2,busNo3,busNo4,busNo5};
		for(int busno=busNos.length-1;busno>=0;busno--)
		{
			String refName=busNos[busno];
			System.out.println(refName);
		}
        System.out.println("end main in BusNo");
	}
}