class Hotels{
	public static void order(String item){
		System.out.println("start order in Hotel");
		System.out.println(item);
	}
	public static void chef(String item,double price){
		System.out.println(item +" "+price);
	}
	public static void menu(String item,double price,int quantity){
		System.out.println(item +" "+ price +" "+ quantity);
	}
	public static void cook(String item,double price,int quantity,boolean parcel){
		System.out.println(item +" "+ price +" "+ quantity +" "+ parcel);
		System.out.println("end order in Hotel");
	}
	public static void main(String[] args){
		System.out.println("start main in Hotel");
		System.out.println("Items");
		Hotels.order("choclate");
	    Hotels.order("icecream");
	    Hotels.order("Vegetables");
	    System.out.println("Items and Price");
	    Hotels.chef("Piza",100d);
	    Hotels.chef("Fruits",50d);
	    Hotels.chef("Burger",200d);
	    System.out.println("tems and Price and quantity");
	    Hotels.menu("Pasta", 12.99d, 2); 
        Hotels.menu("Breadsticks", 4.99d, 3);  
        Hotels.menu("Wings", 9.99d, 10);  
	    System.out.println("tems and Price and quantity and parcel");
	    Hotels.cook("Salad", 8.99, 1, true); 
        Hotels.cook("Soup", 6.50, 2, false);  
        Hotels.cook("Cake", 4.50, 1, true); 
		System.out.println("end main in Hotel");
		
    }
}