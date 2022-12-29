package vehicles;

public class Plane extends Vehicle implements Flying{

    public Plane(String name) {
        super(name);
    }

    @Override
    public void takeOff() {
        System.out.println(this+"took off");

    }

    @Override
    public void land() {
        System.out.println(this+"landed");

    }

    @Override
    public void callAirControl() {
        System.out.println(this+" requestet clerance for landing");

    }

    @Override
    public double getFuelNeeds() {
        return 6700;
    }

    @Override
    public double getDistance() {
        return 12990;
    }

    @Override
    public void go() {
        super.go();
        takeOff();
    }

    @Override
    public void stop() {
        land();
        super.stop();
    }
}
