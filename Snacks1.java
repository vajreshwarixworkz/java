class Snacks1{
	public static void main(String[] args)
	{
		System.out.println("start main in Snacks");
		String snackName1="PotatoChips";
		String snackName2="pizza";
		String snackName3="burger";
		String snackName4="samosa";
		String snackName5="icecream";
		String snackName6="Cookies";
		String snackName7="CheesePuffs";
		String snackName8="Brownies";
		String snackName9="Nuts";
		String snackName10="Beef Jerky";
		String snackName11="lassi";
		String snackName12="fingerChips";
		String snackName13="eggPuff";
		String snackName14="gobiManchuri";
		String snackName15="sandwitch";
		String snackName16="breadtost";
		String snackName17="magie";
		String snackName18="juice";
		String snackName19="Guacamole";
		String snackName20="Popcorn";
		String snackName21="Veggie Chips";
		String snackName22="Pretzels";
		String snackName23="Nachos";
		String snackName24="GranolaBars";
		String snackName25="FruitSnacks";
		
		String[] snacksnames={snackName1,snackName2,snackName3,snackName4,snackName5,snackName6,snackName7,snackName8,snackName9,snackName10,snackName11,snackName12,snackName13,snackName14,snackName15,snackName16,snackName17,snackName18,snackName19,snackName20,snackName21,snackName22,snackName23,snackName24,snackName25};
		for(int snack=snacksnames.length-1;snack>=0;snack--)
		{
			String refName=snacksnames[snack];
			System.out.println(refName);
		}
		System.out.println("end main in Snacks");
	}
}
