package vehicles;

public class Car extends Vehicle{
    public Car(String name) {
        super(name);
    }

    @Override
    public double getFuelNeeds() {
        return 80;
    }

    @Override
    public double getDistance() {
        return 1235;
    }
}
