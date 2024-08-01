class Animals{
	public static void main(String[] args)
	{
		System.out.println("start main in Animal");
		String animalName1="Lion";
		String animalName2="Owl";
		String animalName3="Eagle";
		String animalName4="Grizzly Bear";
		String animalName5="Fox";
		String animalName6="Alligator";
		String animalName7="Wolf";
		String animalName8="Hippopotamus";
		String animalName9="Crocodile";
		String animalName10="PolarBear";
		String animalName11="Rhinoceros";
		String animalName12="Koala";
		String animalName13="Gorilla";
		String animalName14="Panda";
		String animalName15="Kangaroo";
		String animalName16="Giraffe";
		String animalName17="Chimpanzee";
		String animalName18="Zebra";
		String animalName19="Elephant";
		String animalName20="Tiger";
		String[] animalsNames={animalName1,animalName2,animalName3,animalName4,animalName5,animalName6,animalName7,animalName8,animalName9,animalName10,animalName11,animalName12,animalName13,animalName14,animalName15,animalName16,animalName17,animalName18,animalName19,animalName20};
		for(int animal=animalsNames.length-1;animal>=0;animal--)
		{
		 String refName=animalsNames[animal];
		 System.out.println(refName);
			
		}
		System.out.println("end main in Animal");	
		
	}
}