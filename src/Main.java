public class Main {
    public static void main(String[] args) {

        Transport[] car = new Transport[]{
                new Transport("car 1", 4),
                new Transport("car 2", 4),
                new Transport("car 3", 1),
        };
        Transport[] truck = new Transport[]{
                new Transport("truck 1", 6),
                new Transport("truck 2", 8),
                new Transport("truck 3", 1),
        };
        Transport[] bicycle = new Transport[]{
                new Transport("bicycle 1", 2),
                new Transport("bicycle 2", 2),
                new Transport("bicycle 3",1)
        };
        ServiceStationPrint station = new ServiceStation();
        station.check(car);
        station.check(truck);
        station.check(bicycle);
    }
}