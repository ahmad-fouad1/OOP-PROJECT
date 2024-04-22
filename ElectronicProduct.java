package project1;

public class ElectronicProduct extends Product {

    private String brand;
    private int warrantyPeriod;

    public ElectronicProduct(String name, int productId, float price, String brand, int warrantyPeriod) {
        super(name, productId, price);
        this.brand = brand;
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = Math.abs(productId);
    }

}
