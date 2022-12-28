public class Address {
    String street;
    String zip;
    String location;

    //konstruktor
    Address( String street, String zip, String location){
       this.street = street;
        this.zip=zip;
        this.location=location;
    }

    //konwersja adresu na stringa
    public String getInfo(){
        return String.format("%s, %s, %s", street, zip, location);
    }

}
