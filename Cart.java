package project1;

public class Cart {

    private int customerId;
    private int nProducts;
    private Product[] p_arr;
    public float totalprice = 0;
    Order order;
    private int count = 0;

    public Cart(int customerId, int nProducts) {
        this.p_arr = new Product[nProducts];
        this.customerId = customerId;
        this.nProducts = nProducts;
        order = new Order(customerId, nProducts, p_arr);
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = Math.abs(nProducts);
    }

    public int getnProducts() {
        return nProducts;
    }

    public void setnProducts(int nProducts) {
        this.nProducts = Math.abs(nProducts);
    }

    public Product[] getArr() {
        return p_arr;
    }

    public void setArr(Product[] arr) {
        this.p_arr = arr;
    }

    public void addProduct(Product obj) {

        p_arr[count] = obj;
        this.totalprice += this.p_arr[count].price;
        count++;

    }

    public Product[] deleteProduct(Product obj) {
        int n = -1;
        for (int i = 0; i < p_arr.length; i++) {
            if (p_arr[i].getProductId() == obj.productId) {
                n = i;
                this.totalprice -= this.p_arr[n].price;
                break;
            }
        }
        if (n != -1) {
            Product[] new_p_arr = new Product[p_arr.length - 1];
            System.arraycopy(p_arr, 0, new_p_arr, 0, n);
            System.arraycopy(p_arr, n + 1, new_p_arr, n, p_arr.length - n - 1);
            return new_p_arr;
        }
        return p_arr;
    }

    public float calculatePrice() {
        return this.totalprice;
    }

    public void placeOrder() {

        order.totalPrice = this.totalprice;
        order.products = p_arr;
        System.out.println("Here's your order's summary :");
        order.printOrderInfo();

    }
}
