 class Service{
	public static void test(double height,double weight,int age){
		System.out.println("Running test in Service");
		if(height>=6.5 && weight>=75 && age<=28){
		System.out.println("correct measurement for police");
	
		}
		else{
			System.out.println("not a correct mearsurement for police");
		}
	}
	public static void main(String[] args){
	System.out.println("start main in Service");
	test(6.7,78,29);
	System.out.println("end main in Service");
	}
	}