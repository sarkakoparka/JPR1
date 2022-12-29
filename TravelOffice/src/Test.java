public class Test {
  public static void main(String[] args) {

        TravelOffice biuro = new TravelOffice();


        Date start = new Date(2022, 12, 31);
        Date powrot = new Date (2023, 1, 17);
        AbroadTrip wycieczkaZagraniczna = new AbroadTrip ("Dominikana", start, powrot);

        Address adres = new Address("Aleje Ujazdowskie","00-007","Warszawa");
        wycieczkaZagraniczna.setPrice(5730);
        wycieczkaZagraniczna.setInsurance(120);

        Date startKraj = new Date(2023,1,7);
        Date powrotKraj = new Date (2023,1,21);
        DomesticTrip wycieczkaKrajowa = new DomesticTrip("Kotlina Kłodzka", startKraj, powrotKraj);

        Customer klient = new Customer("John Doe");
        klient.setAddress(adres);
        klient.assignTrip(wycieczkaZagraniczna);
        biuro.addCustomer(klient);

        Customer klientTest = new Customer("Anna Doe");
        klient.setAddress(adres);
        klient.assignTrip(wycieczkaZagraniczna);
        biuro.addCustomer(klient);

        System.out.println(biuro);

    }
}
