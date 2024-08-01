class Marriage{
	public static void vivah(int age,String name){
		System.out.println("running vivah in marriage");
		String name1="Diamond";
		System.out.println("Name1:"+name1);
		if(age>=21)
		{
		System.out.println("correct age of marriage");
		}
		else{
		System.out.println("not a age to get married");
		
		}
	}
		public static void main(String[] args)
		{
			System.out.println("start main in Marriage");
			Marriage.vivah(21,"vajra");
			System.out.println("end main in Marriage");
		}
	}
