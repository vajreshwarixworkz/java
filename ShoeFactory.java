class ShoeFactory {
    public static double order(String brandname) 
	{
        System.out.println("start order in ShoeFactory");
        System.out.println("brandname: " + brandname);
        
        if (brand=="puma") 
		{
            System.out.println("puma");
            return 1500;
        }  else if (brand=="nike")
			{
            System.out.println("nike");
            return 2000;
        }
        
        return 0;
    }
}
