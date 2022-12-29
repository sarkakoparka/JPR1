
// Własne typy danych; posługiwanie się referencjami do obiektów
public class Test{
    public static void main(String[] args) {
        //nowy obiekt z klasy Date
        Date start = new Date(2019, 7, 23);
        //kolejny obiekt klasy Date
        Date end = new Date(2020,5,19);

        System.out.println(start.toString());
        System.out.println(end.toString());
        //deklarujemy zmienna today
        Date today;
        today = start;
        System.out.println(today.toString());
        //today.day = 5;
        //today.year =2021;
        System.out.println(today.toString());
        end = today;
        System.out.println(end.toString());
        //System.out.println(start.day+"."+ start.month+"."+start.year);
        //System.out.println(end.day+"."+ end.month+"."+end.year);
    }
}