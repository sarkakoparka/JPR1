public class Test {
  public static void main(String[] args) {

        TravelOffice biuro = new TravelOffice();
        Date start = new Date(2022, 12, 31);
        Date powrot = new Date (2023, 1, 17);

        AbroadTrip wycieczkaZagraniczna = new AbroadTrip ("Dominikana", start, powrot);
        Address adres = new Address("Aleje Ujazdowskie","00-007","Warszawa");
    wycieczkaZagraniczna.setPrice(5000);
    wycieczkaZagraniczna.setInsurance(100);



        Customer klient = new Customer("John Doe");
        klient.setAddress(adres);
        klient.assignTrip(wycieczkaZagraniczna);
        biuro.addCustomer(klient);

        klient = new Customer("Anna Doe");
        klient.setAddress(adres);
        klient.assignTrip(wycieczkaZagraniczna);
        biuro.addCustomer(klient);

        System.out.println(biuro);

    }
}
