class MedicalShop{
	public static void medical(String medicineName){
		System.out.println(medicineName);
	}
	public static void medicine(String medicineName,double quantity){
		System.out.println(medicineName+" "+quantity);
	}
	public static void customer(String customerName,String email,long mobileNo,String address){
		System.out.println(customerName+" "+email+" "+mobileNo+" "+address);
	}
	public static void tablet(String customerName,long mobileNo){
		System.out.println(customerName+" "+mobileNo);
	}
	public static void main(String[] args){
		MedicalShop.medical("Paracetamol");
		MedicalShop.medical("Ibuprofen");
		MedicalShop.medical("Amoxicillin");
		System.out.println("Medicine name and quantity");
		MedicalShop.medicine("Aspirin", 10);
        MedicalShop.medicine("Cough Syrup", 5);
        MedicalShop.medicine("Vitamin C", 20);
		System.out.println("Customer name and email and mobile number and address");
		MedicalShop.customer("John Doe", "john@example.com", 1234567890L, "123 Main St");
        MedicalShop.customer("Jane Smith", "jane@example.com", 987654321L, "456 Elm St");
        MedicalShop.customer("Alice Johnson", "alice@example.com", 1122334455L, "789 Oak St");
		System.out.println("Customer name and mobile number");
		MedicalShop.tablet("Bob Brown",2233445566L);
        MedicalShop.tablet("Charlie Davis", 3344556677L);
        MedicalShop.tablet("Dana Evans", 4455667788L);

		


	}

}