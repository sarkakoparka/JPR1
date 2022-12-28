import java.sql.SQLOutput;

public class TravelOffice {
    public static void main(String[] args) {
        Date start = new Date(2022, 12, 31);
        Date powrot = new Date (2023, 1, 17);

        Trip wycieczka = new Trip ("Dominikana", start, powrot);
        Address adres = new Address("Aleje Ujazdowskie","00-007","Warszawa");
        Customer klient = new Customer("John Doe");

        klient.setAddress(adres);
        klient.assignTrip(wycieczka);

        System.out.println(klient.getInfo());

    }
}