public class Product {
    private String product;
    private double price;
    private int quantity;
    private double total;
    private double discount;

    public Product(String product, double price, int quantity){
        this.product = product;
        this.price = price;
        this.quantity = quantity;
    }

    public void displayOrder(){
        System.out.println("Enter product name: " + product);
        System.out.println("Enter Price: " + price);
        System.out.println("Enter Quantity: " + quantity);
        System.out.println("----------------------------------");
    }

    public void calculateTotal(){
        total = price * quantity;
        System.out.println(product + " Total is: " + total);
    }

    public void calculateDiscount(){
        if(total >= 10000){
            discount = total * 0.20;
        }
        else if(total >= 5000){
            discount = total * 0.15;
        }
        else if(total >= 1000){
            discount = total * 0.10;
        }
        else{
            discount = 0.00;
        }
    }

    public void calculateFinalAmount(){
        if(total >= 10000){
            total -= discount;
            System.out.println(product + " Discount: 20%");
        }
        else if(total >= 5000){
            total -= discount;
            System.out.println(product + " Discount: 15%");
        }
        else if(total >= 1000){
            total -= discount;
            System.out.println(product + " Discount: 10%");
        }
        else{
            total -= discount;
            System.out.println(product + " Discount: 0%");
        }
    }
}
