package project1;


public class Order {

    public int customerId;
    public static int orderId = 1;
    public Product products[];
    public float totalPrice;
    public int nproduct;

    public Order(int customerId, int nproduct, Product[] products) {
        this.customerId = customerId;
        this.products = products;
        this.nproduct = nproduct;
    }

    public void printOrderInfo() {
        System.out.println("Order ID : " + Order.orderId );
        System.out.println("Customer  ID :" + this.customerId);
        System.out.println("Products : ");
        for (int i = 0; i < this.nproduct; i++) {
            System.out.println(products[i].name +"--"+products[i].price);
        }
        System.out.println("Total price = " + this.totalPrice);
    }
    
}
