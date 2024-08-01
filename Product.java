class Product {
    public static void smartwatch(int price, int quantity, int pincode, long mobileNo) {
        System.out.println("running smartwatch in Product");
      
        if(price >= 2000 && quantity <= 6 && pincode >= 5 && mobileNo >= 10) {
            System.out.println("valid product");
        } else {
            System.out.println("invalid product");
        }
    }

    public static void main(String[] args) {
        System.out.println("start main in Product");
        smartwatch(1500, 4, 12345, 9972562061L); 
        System.out.println("end main in Product");
    }
}