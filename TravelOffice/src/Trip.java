//import java.util.Date;


public abstract class Trip {
    private String destination;
    private Date start;
   private Date end;
   private int price;


    public Trip (String destination, Date start, Date end){
        this.destination=destination;
        this.start=start;
        this.end=end;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format(" From  %s to %s,%s, price: %d", start, end, destination, getPrice());
    }
}