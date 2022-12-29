public class AbroadTrip extends Trip   {
    private int insurance;

    public AbroadTrip(String destination, Date start, Date end) {
        super(destination, start, end);
    }

    // metoda ustawiająca koszt ubezpieczenia
    public void setInsurance(int insurance) {
        this.insurance = insurance;
    }
    @Override
    public int getPrice() {
        return super.getPrice() + insurance;
    }



}
