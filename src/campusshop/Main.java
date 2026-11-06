package campusshop;


public class Main {

    public static void main(String[] args) {

        // QUESTION 3: Create five independent Product objects.
        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new Product();
        Product product4 = new Product();
        Product product5 = new Product();

        // Assign details to product 1.
        product1.setProductId(101);
        product1.setProductName("Exercise Book");
        product1.setProductCategory("Stationery");
        product1.setUnitPrice(3000);
        product1.setQuantityInStock(50);

        // Assign details to product 2.
        product2.setProductId(102);
        product2.setProductName("Blue Pen");
        product2.setProductCategory("Writing Materials");
        product2.setUnitPrice(1000);
        product2.setQuantityInStock(100);

        // Assign details to product 3.
        product3.setProductId(103);
        product3.setProductName("Printing Paper");
        product3.setProductCategory("Printing Materials");
        product3.setUnitPrice(15000);
        product3.setQuantityInStock(30);

        // Assign details to product 4.
        product4.setProductId(104);
        product4.setProductName("Flash Disk");
        product4.setProductCategory("Computer Accessories");
        product4.setUnitPrice(25000);
        product4.setQuantityInStock(20);

        // Assign details to product 5.
        product5.setProductId(105);
        product5.setProductName("Calculator");
        product5.setProductCategory("Electronics");
        product5.setUnitPrice(35000);
        product5.setQuantityInStock(15);

        // QUESTION 4(a): Display all five products using getter methods.
        System.out.println("CAMPUS SHOP INVENTORY MANAGEMENT SYSTEM");
        System.out.println("INITIAL PRODUCT INFORMATION");
        displayProduct(product1);
        displayProduct(product2);
        displayProduct(product3);
        displayProduct(product4);
        displayProduct(product5);

        System.out.println("\nOBJECT INDEPENDENCE CHECK");
        System.out.println("Product 1 price: UGX " + product1.getUnitPrice());
        System.out.println("Product 2 price: UGX " + product2.getUnitPrice());

        
        System.out.println("\nUPDATING PRODUCT PRICE");
        product1.setUnitPrice(3500);
        displayProduct(product1);

        System.out.println("\nUPDATING STOCK QUANTITY");
        product1.setQuantityInStock(70);
        displayProduct(product1);

        
        System.out.println("\nFINAL UPDATED PRODUCT INFORMATION");
        displayProduct(product1);

        
        System.out.println("\nTESTING INVALID PRICE");
        product1.setUnitPrice(-5000);
        System.out.println("Product price after the invalid attempt: UGX "
                + product1.getUnitPrice());

        System.out.println("\nTESTING INVALID STOCK QUANTITY");
        product1.setQuantityInStock(-10);
        System.out.println("Stock after the invalid attempt: "
                + product1.getQuantityInStock());
    }

    
    public static void displayProduct(Product product) {
        System.out.println("----------------------------------------");
        System.out.println("Product ID: " + product.getProductId());
        System.out.println("Product Name: " + product.getProductName());
        System.out.println("Product Category: " + product.getProductCategory());
        System.out.println("Unit Price: UGX " + product.getUnitPrice());
        System.out.println("Quantity in Stock: " + product.getQuantityInStock());
        System.out.println("----------------------------------------");
    }
}
