public class Main {
    public static void main(String[] args) {

        Car[] car = {
                new Car("car 1", 4),
                new Car("car 2", 4),
                new Car("car 3", 1),
        };
        Truck[] truck= {
                new Truck("truck 1", 6),
                new Truck("truck 2", 8),
                new Truck("truck 3", 1),
        };
        Bicycle[] bicycle = {
                new Bicycle("bicycle 1", 2),
                new Bicycle("bicycle 2", 2),
                new Bicycle("bicycle 3", 1),
        };

        ServiceStationPrint station = new ServiceStation();
        station.check(car);
        station.check(truck);
        station.check(bicycle);
    }
}