//import java.util.Date;


public class Trip {
    String destination;
    Date start;
    Date end;


    public Trip (String destination, Date start, Date end){
        this.destination=destination;
        this.start=start;
        this.end=end;
    }
    public String getInfo() {
        return String.format(" From  %s to %s", start.getInfo(), end.getInfo(), destination);
    }
}