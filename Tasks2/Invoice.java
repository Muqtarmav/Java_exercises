package Tasks2;

public class Invoice implements Payable {

    private String partNumber;

    private String partDescription;
    private int quantity;
    private double priceItem;


    public Invoice(String partNumber, String partDescription, int quantity, double priceItem) {

        if ( quantity < 0){
            throw new IllegalArgumentException("quantity should not be zero");

        }

        if ( priceItem < 0){
            throw new IllegalArgumentException("item price cannot be zero");
        }

        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.priceItem = priceItem;
    }


    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {

        if ( quantity < 0){
            throw new IllegalArgumentException("quantity should not be zero");
        }


        this.quantity = quantity;
    }

    public double getPriceItem() {
        return priceItem;
    }

    public void setPriceItem(double priceItem) {


        if ( priceItem < 0){
            throw new IllegalArgumentException("item price cannot be zero");
        }


        this.priceItem = priceItem;
    }



    public String toString(){
        return String.format("%s: %n%s: %s (%s) %n%s: %d %n%s: $%,.2f",
                 "invoice", "part number", getPartNumber(), getPartDescription(),
                "quantity", getQuantity(), "price per item", getPriceItem());

    }

    @Override
    public double getPaymentAmount() {
        return getQuantity() * getPriceItem();
    }
}
