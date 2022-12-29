package vehicles;

public class Ship extends Vehicle implements Sailing{
    public Ship(String name) {
        super(name);
    }

    @Override
    public void dock() {
        System.out.println(this+"docked");
    }

    @Override
    public double getFuelNeeds() {
        return 3450;
    }

    @Override
    public double getDistance() {
        return 540;
    }

    @Override
    public void stop() {
        dock();
    }
}
