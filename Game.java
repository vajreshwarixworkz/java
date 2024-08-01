class Game{
	public static void main(String[] args)
	{
		System.out.println("start main in Game");
		String gameName1="Tennis";
		String gameName2="ludo";
		String gameName3="CandyCrush";
		String gameName4="Scrabble";
		String gameName5="Badminton";
		String gameName6="Basketball";
		String gameName7="Volleyball";
		String gameName8="hockey";
		String gameName9="cricket";
		String gameName10="Chess";
		String[] gameNames={gameName1, gameName2, gameName3, gameName4, gameName5, gameName6, gameName7, gameName8, gameName9, gameName10};
		for(int play=0;play<gameNames.length;play++)
		{
			String refName=gameNames[play];
			System.out.println(refName);
		}
		System.out.println("end main in Game");
		
		
	}
}