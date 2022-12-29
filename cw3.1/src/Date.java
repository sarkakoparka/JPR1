public class Date {
    //atrybuty
    private int day;
    private int month;
    private int year;


        //konstruktor żeby stworzyć później obiekt!
    public Date(int year, int month, int day)
    {
     this.year = year;
     this.month =month;
     this.day = day;
    }
public String toString() {
    // return year+"-"+month+"-"+day;
    return String.format("%4d-%2d-%2d", this.year, this.month, this.day);
}
}
