public class MainProduct {
    public static void main(String[] args){
        Product IOS = new Product("Laptop", 12500.00, 1);
        Product android = new Product("Infinix", 2500, 3);

        IOS.displayOrder();
        android.displayOrder();

        IOS.calculateTotal();
        android.calculateTotal();

        IOS.calculateDiscount();
        android.calculateDiscount();

        IOS.calculateFinalAmount();
        android.calculateFinalAmount();
    }
}
