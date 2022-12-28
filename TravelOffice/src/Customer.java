public class Customer {
    //atrybuty
    String name;
    Address address;
    Trip trip;

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
    public String getInfo() {
        return String.format(" Name: %s%nAddress: %s%nTrip: %s%n", name, address.getInfo(), trip.getInfo());
    }
}
