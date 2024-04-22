package project1;
public class Product {
    protected int productId ;
    protected String name;
    protected float price ;

    public int getProductId() {
        return productId;
    }

    public Product( String name,int productId, float price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }
    Product (){}

    public void setProductId(int productId) {
        this.productId = Math.abs(productId);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = Math.abs(price);
    }
    
    
}
