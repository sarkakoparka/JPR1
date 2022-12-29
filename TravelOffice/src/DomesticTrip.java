

public class DomesticTrip extends Trip{
    private int ownArrivalDiscount;


    public DomesticTrip(String destination, Date start, Date end) {
        super(destination, start, end);
    }
    public void setOwnArrivalDiscount(int ownArrivalDiscount) {
        this.ownArrivalDiscount = ownArrivalDiscount;
    }
    @Override
    public int getPrice(){
        return super.getPrice() - ownArrivalDiscount;
    }
}
