public class Date {
    //atrybuty
    int day;
    int month;
    int year;


        //konstruktor żeby stworzyć później obiekt!
    public Date(int year, int month, int day)
    {
     this.year = year;
     this.month =month;
     this.day = day;
    }
public String getInfo () {
    // return year+"-"+month+"-"+day;
    return String.format("%4d-%2d-%2d", this.year, this.month, this.day);
}
}
