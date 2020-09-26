package smallStore;

public class Products {
    private int Id;
    private String productName;
    private String productDescription;
    private int numberOfItems;
    private String totalPrice;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Products{" +
                "Id=" + Id +
                ", productName='" + productName + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", numberOfItems=" + numberOfItems +
                ", totalPrice='" + totalPrice + '\'' +
                '}';
    }
}
