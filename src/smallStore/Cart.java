package smallStore;

public class Cart {
    private int numberOfItems;
    private int unitPrice;
    private productDecscription productDecscription;
    private String totalPrice;
    private  int productId;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public smallStore.productDecscription getProductDecscription() {
        return productDecscription;
    }

    public void setProductDecscription(smallStore.productDecscription productDecscription) {
        this.productDecscription = productDecscription;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "numberOfItems=" + numberOfItems +
                ", unitPrice=" + unitPrice +
                ", productDecscription=" + productDecscription +
                ", totalPrice='" + totalPrice + '\'' +
                '}';
    }
}
