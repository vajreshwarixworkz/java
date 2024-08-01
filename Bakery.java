class Bakery{
	
public static void bake()
{
System.out.println("running bake in Bakery");
Chef.cook();
}
public static void cake()
{
	System.out.println("running cake in Bakery");
	Assistant.assist();
}

public static void sell()
{
	System.out.println("running sell in Bakery ");
}

}