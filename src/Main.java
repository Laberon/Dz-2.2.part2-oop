public class Main {
    public static void main(String[] args) {
        Car car = new Car("car 1",4);
        Car car2 = new Car("car 2",4);

        Car[] cars=new Car[]{
                new Car("car 1",4),
                new Car("car 2",4),
        };
        Truck[] trucks=new Truck[]{
                new Truck("truck 1",6),
                new Truck("truck 2",8),
        };
        Bicycle[] bicycles=new Bicycle[]{
                new Bicycle("bicycle 1",2),
                new Bicycle("bicycle 2",2),
        };

        ServiceStationPrint station = new ServiceStation();
        station.check(cars,null,null);
        station.check(null,bicycles,null);
        station.check(null,null,trucks);
    }
}