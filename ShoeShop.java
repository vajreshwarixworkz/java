class ShoeShop {
    public static double purchase(String brand) {
        System.out.println("start purchase in ShoeShop");
        double brandPrice = ShoeFactory.order(brand);
        System.out.println("brandPrice: " + brandPrice);
        return brandPrice;
    }
}