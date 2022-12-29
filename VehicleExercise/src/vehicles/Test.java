package vehicles;

public class Test {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Car("Volvo"),
                new Plane("Dreamliner"),
                new RaceCar("Formuła jeden"),
                new Ship("Titanic 3"),
                new Truck("MAN")
        };
        for (Vehicle vehicle: vehicles){
            vehicle.go();
            if (vehicle instanceof Flying) {
                ((Flying) vehicle).callAirControl();
            }
            vehicle.stop();
            System.out.printf("Zużycie paliwa na 100km wynosi: %1f  l%n", vehicle.calculateFuelConsumption());
        }
        }
    }

