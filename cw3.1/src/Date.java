public class Date {
    //atrybuty
    int day;
    int month;
    int year;


        //konstruktor żeby stworzyć później obiekt!
    public Date(int y, int m, int d)
    {
     this.year = y;
     this.month =m;
     this.day = d;
    }
public String getInfo () {
    // return year+"-"+month+"-"+day;
    return String.format("%4d-%2d-%2d", this.year, this.month, this.day);
}
}
