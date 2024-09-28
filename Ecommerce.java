
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

abstract class Product {
    protected String productId,name;
    protected double price;
    protected int quantity;
    abstract String getDetails();
    abstract double calcDisc();
}
class Electronics extends Product {
    private String brand;
    private int warranty;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String getDetails() {
        return "Electronics[Name:"+ name +",ProductID:"+productId+",Price:"+price+",Quantity:"+quantity+",Brand:"+brand+",warrantyPeriod:"+warranty+" years]";
    }

    public double calcDisc() {
        return price-((price*10)/100);
    }
    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


}
class Clothing extends Product {
    private String size,material;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String getDetails() {
        return "Clothing[Name:"+ name +",ProductID:"+productId+",Price:"+price+",Quantity:"+quantity+",Size:"+size+",Material:"+material+"]";
    }

    public double calcDisc() {
        return price-((price*10)/100);
    }
}
class Grocery extends Product {
    private String date;
    private boolean isOrg;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isOrg() {
        return isOrg;
    }

    public void setOrg(boolean org) {
        isOrg = org;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String getDetails() {
        return "Grocery[Name:"+ name +",ProductID:"+productId+",Price:"+price+",Quantity:"+quantity+",Date:"+date+",isOrganic:"+isOrg+"]";
    }

    public double calcDisc() {
        return price-((price*10)/100);
    }
}
class ShoppingCart {
    List<Product> l=new ArrayList<>();
    void add(Product product) {
        l.add(product);
    }
    void remove(Product product) {
        l.remove(product);
    }
    double calcTot() {
        double total=0;
        for(Product p:l) {
            total+=p.calcDisc();
        }
        return total;
    }
    List<Product> getList() {
        return  l;
    }
}
public class Ecommerce {
    public static void main(String[] args) {

        Electronics electronics=new Electronics();
        electronics.setName("Laptop");
        electronics.setProductId("2ACMO990");
        electronics.setBrand("Lenova");
        electronics.setPrice(90000);
        electronics.setQuantity(10);
        electronics.setWarranty(3);

        ShoppingCart sh=new ShoppingCart();
        sh.add(electronics);

        for(Product p:sh.getList()) {
            System.out.println(p.getDetails());
        }

        System.out.println("Total:"+sh.calcTot());
    }
}
