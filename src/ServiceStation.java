public class ServiceStation implements ServiceStationPrint {
    @Override
    public void check(Car[] car, Bicycle[] bicycle, Truck[] truck) {
        if (car != null) {
            printModel(car);
            for (int i = 0; i < car.length; i++) {
                updateTyre();
            }
            checkEngine();
            System.out.println();
        } else if (truck != null) {
            printModel(truck);
            for (int i = 0; i < truck.length; i++) {
                updateTyre();
            }
            checkEngine();
            checkTrailer();
            System.out.println();
        } else if (bicycle != null) {
            printModel(bicycle);
            for (int i = 0; i < bicycle.length; i++) {
                updateTyre();
            }
            System.out.println();
        }
    }
    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышки");
    }
    @Override
    public void checkTrailer() {
        System.out.println("Проверяем прицепы");
    }

    private void printModel(Transport[] transports) {
        for (int i = 0; i < transports.length; i++) {
            Transport transport = transports[i];
            System.out.println(transport.getModelName());
        }
    }
}