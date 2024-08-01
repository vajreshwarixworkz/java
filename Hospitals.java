class Hospitals{
	public static String name()
	{
		String hospitalName="agarwal";
		System.out.println(hospitalName);
		return hospitalName;
	}
	public static String specialization()
	{
		String hospitalspecialization="eye";
		System.out.println(hospitalspecialization);
		return hospitalspecialization;
	}
	public static String area()
	{
		String hospitalArea="rajajinagar";
		System.out.println(hospitalArea);
		return hospitalArea;
	}
	public static  String opentime()
	{
		String hospitalOpenTime="8.00";
		System.out.println(hospitalOpenTime);
		return hospitalOpenTime;
	}
	public static String closetime()
	{
		String hospitalCloseTime="6.00";
		System.out.println(hospitalCloseTime);
		return hospitalCloseTime;
	}
	public static  double generalconsulting()
	{
		double hospitalGeneralConsulting=200.00;
		System.out.println(hospitalGeneralConsulting);
		return hospitalGeneralConsulting;
	}
	public static void main(String[] args){
		Hospitals.name();
		Hospitals.specialization();
		Hospitals.area();
		Hospitals.opentime();
		Hospitals.closetime();
		Hospitals.generalconsulting();


}
}