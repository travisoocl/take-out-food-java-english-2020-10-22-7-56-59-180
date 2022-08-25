public class reciept{

    public int qty;
    double fPrice;
    public Item item;

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getfPrice() {
        return fPrice;
    }

    public void setfPrice(double fPrice) {
        this.fPrice = fPrice;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public reciept(int qty, double fPrice, Item item) {
        this.qty = qty;
        this.fPrice = fPrice;
        this.item = item;
    }
}
