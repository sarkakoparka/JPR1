package vehicles;

public class RaceCar extends Car {
    public RaceCar(String name) {
        super(name);
    }

    @Override
    public double getFuelNeeds() {
        return 175;
    }
}
