class States{
	public static void main(String[] args)
	{
		System.out.println("start main in State");
		String stateName1="Arunachal Pradesh";
		String stateName2="Assam";
		String stateName3="Bihar";
		String stateName4="Chhattisgarh";
		String stateName5="Goa";
		String stateName6="Gujarat";
		String stateName7="Haryana";
		String stateName8="HimachalPradesh";
		String stateName9="Jharkhand";
		String stateName10="Karnataka";
		String stateName11="Kerala";
		String stateName12="Madhya Pradesh";
		String stateName13="Maharashtra";
		String stateName14="Manipur";
		String stateName15="Meghalaya";
		String stateName16="Mizoram";
		String stateName17="Nagaland";
		String stateName18="Odisha";
		String stateName19="Punjab";
		String stateName20="Rajasthan";
		String stateName21="Sikkim";
		String stateName22="Tamil Nadu";
		String stateName23="Telangana";
		String stateName24="Tripura";
		String stateName25="Uttar Pradesh";
		String stateName26="Uttarakhand";
		String stateName27="West Benga";
		String stateName28="Andhra Pradesh";
		String[] statesNames={stateName1,stateName2,stateName3,stateName4,stateName5,stateName6,stateName7,stateName8,stateName9,stateName10,stateName11,stateName12,stateName13,stateName14,stateName15,stateName16,stateName17,stateName18,stateName19,stateName20,stateName21,stateName22,stateName23,stateName24,stateName25,stateName26,stateName27,stateName28};
		for(int state=statesNames.length-1;state>=0;state--)
		{
			String refName=statesNames[state];
			System.out.println(refName);
		}
        System.out.println("end main in State");		
	}
}