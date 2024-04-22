package project1;
public class ClothingProduct extends Product{
private String size;
private String fabric;

    public ClothingProduct(String name, int productId, float price, String size ,String fabric) {
        super( name,productId, price);
        this.size = size;
        this.fabric = fabric;
    }
    ClothingProduct (){}


    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFabric() {
        return fabric;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

}
