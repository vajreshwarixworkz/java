class Song{
	public static void main(String[] args)
	{
	System.out.println("start main in Song");
	String songName1="Belageddu";	
	String songName2="PreethsePreethse";
	String songName3="OnduMalebillu";	
	String songName4="PowerofYouth";
	String songName5="BombeHelutaite";
	String songName6="MentalHoJawa";	
	String songName7="RaRaRakkamma";
	String songName8="KannuHodiyaka";
	String songName9="Garbadhi";	
	String songName10="Pogaru";
	
	String[] songNames={songName1,songName2,songName3,songName4,songName5,songName6,songName7,songName8,songName9,songName10};
	for(int songname=0;songname<songNames.length;songname++)
	{
		String refName=songNames[songname];
		System.out.println(refName);
	}
	System.out.println("end main in Song");
	}
}