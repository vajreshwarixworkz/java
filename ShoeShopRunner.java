class ShoeShopRunner {
    public static void main(String[] args) {
        System.out.println("start main in ShoeShopRunner");
        double price = ShoeShop.purchase("puma"); 
        System.out.println("Purchase amount: " + price);
        System.out.println("end main in ShoeShopRunner");
    }
}