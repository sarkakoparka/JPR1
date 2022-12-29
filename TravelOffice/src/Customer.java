public class Customer {
    //atrybuty
    private String name;
    private Address address;
    private Trip trip;

    //konstruktor

    public Customer(String name) {
        this.name = name;
    }
    public void setAddress(Address address) {
        this.address=address;
    }
    public void assignTrip( Trip trip){
        this.trip=trip;
    }
   @Override
    public String toString() {
        return String.format(" Name: %s%nAddress: %s%nTrip: %s%n", name, address, trip);
    }
}
