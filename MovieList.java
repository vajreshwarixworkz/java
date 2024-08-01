class MovieList																																		{
	public static void main(String[] args)
	{
		System.out.println("start main in Movie");
		String movieName1="Kantara";
		String movieName2="galiPata";
		String movieName3="googly";
		String movieName4="milana";
		String movieName5="appu";
		String movieName6="chowka";
		String movieName7="banaras";
		String movieName8="bellBottom";
		String movieName9="tagaru";
		String movieName10="dia";
		String movieName11="loveMoctail";
		String movieName12="kotigobba";
		String movieName13="yajamana";
		String movieName14="Raajakumara";
		String movieName15="Anjaniputra";
		String movieName16="Rangitaranga";
		String movieName17="ammaILoveYou";
		String movieName18="surya";
		String movieName19="k.g.f";
		String movieName20="bahubali";
		 
		String[] movieNames={movieName1,movieName2,movieName3,movieName4,movieName5,movieName6,movieName7,movieName8,movieName9,movieName10,movieName11,movieName12,movieName13,movieName14,movieName15,movieName16,movieName17,movieName18,movieName19,movieName20};
		for(int watchingMovie=movieNames.length-1;watchingMovie>=0;watchingMovie--)
		{
			String refName=movieNames[watchingMovie];
			System.out.println(refName);
		}
	
		System.out.println("end main in Movie");	
		
	}
}