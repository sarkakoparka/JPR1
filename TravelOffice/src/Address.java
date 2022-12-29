public class Address {
    private String street;
   private String zip;
   private String location;

    //konstruktor
    Address( String street, String zip, String location){
       this.street = street;
        this.zip=zip;
        this.location=location;
    }

    //konwersja adresu na stringa
    @Override
    public String toString(){
        return String.format("%s, %s, %s", street, zip, location);
    }

}
