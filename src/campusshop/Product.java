package campusshop;

public class Product {

    // Product attributes
    private int productId;
    private String productName;
    private String productCategory;
    private double unitPrice;
    private int quantityInStock;

    // No-argument constructor. Values are assigned using setter methods.
    public Product() {
    }

    // Getter methods
    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    // Setter methods
    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    // Validation: a product price cannot be negative.
    public void setUnitPrice(double unitPrice) {
        if (unitPrice >= 0) {
            this.unitPrice = unitPrice;
        } else {
            System.out.println("Error: Price cannot be negative. Price was not changed.");
        }
    }

    // Validation: stock quantity cannot be negative.
    public void setQuantityInStock(int quantityInStock) {
        if (quantityInStock >= 0) {
            this.quantityInStock = quantityInStock;
        } else {
            System.out.println("Error: Stock quantity cannot be negative. Stock was not changed.");
        }
    }
}
