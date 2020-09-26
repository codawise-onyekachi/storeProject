package smallStore;

public class Receipt {
    private String eStoreNumber;
    private String receiptNumber;
    private String customerName;
    private String totalPrice;
    private String itemDescription;

    public String geteStoreNumber() {
        return eStoreNumber;
    }

    public void seteStoreNumber(String eStoreNumber) {
        this.eStoreNumber = eStoreNumber;
    }

    public String getReceiptNumber() {
        return receiptNumber;
    }

    public void setReceiptNumber(String receiptNumber) {
        this.receiptNumber = receiptNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "eStoreNumber='" + eStoreNumber + '\'' +
                ", receiptNumber='" + receiptNumber + '\'' +
                ", customerName='" + customerName + '\'' +
                ", totalPrice='" + totalPrice + '\'' +
                ", itemDescription='" + itemDescription + '\'' +
                '}';
    }
}
