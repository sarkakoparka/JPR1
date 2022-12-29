package vehicles;

public abstract class Vehicle {
    private String name;

    public Vehicle(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return name;
    }
    // ile paliwa
    public abstract double getFuelNeeds();


    // jaki dystans
    public abstract double getDistance();


    public double calculateFuelConsumption(){

        return getFuelNeeds() / getDistance() * 100;
    }

    /* refleksja
    * Class c = String.class;
    * Class c =obj.getClass();
    *
    * */
    public void go() {
        System.out.println(getClass().getSimpleName()+ ": " + this + " started");
    }
    public void stop() {
        System.out.println(getClass().getSimpleName()+ ": " + this + " stopped");
    }
}