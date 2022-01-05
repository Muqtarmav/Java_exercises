package holidayTasks;

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int itemQuantity;
    private int priceItem;


    public Invoice(String partNumber, String partDescription, int itemQuantity, int priceItem){

        if (itemQuantity < 0 || priceItem < 0){
            throw new IllegalArgumentException("itemQuantity or priceItem cannot be less than 0");
        }

        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.itemQuantity = itemQuantity;
        this.priceItem = priceItem;

    }



    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }


    public String getPartNumber() {
        return partNumber;
    }


    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }


    public String getPartDescription() {
        return partDescription;
    }


    public void setItemQuantity(int itemQuantity) {

        if (itemQuantity < 0){
            throw new IllegalArgumentException("invalid quantity");
        }

        this.itemQuantity = itemQuantity;
    }


    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setPriceItem(int priceItem) {
        if (priceItem < 0){
            throw new IllegalArgumentException("price is not valid");
        }

        this.priceItem = priceItem;
    }

    public int getPriceItem() {
        return priceItem;
    }

    public double getInvoiceAmount(){
        return itemQuantity * priceItem;
    }


}
