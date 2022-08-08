public class ServiceStation implements ServiceStationPrint {
    @Override
    public void check(Transport[] transport) {
        for (int i = 0; i < transport.length; i++) {
            Transport transports = transport[i];
        if (transports.getWheelsCount() == 4) {
            System.out.println(transports.getModelName());
            updateTyre();
            checkEngine();
        } else if (transports.getWheelsCount() == 2) {
            System.out.println(transports.getModelName());
            updateTyre();
        } else if (transports.getWheelsCount()>=4) {
            System.out.println(transports.getModelName());
            updateTyre();
            checkEngine();
            checkTrailer();
        } else if (transports.getWheelsCount() <= 1) {
            System.out.println(transports.getModelName());
            System.out.println("Проверьте колличество колес");
        }
    }}
    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышки");
    }
    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
    @Override
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    public void printSeparator() {
        System.out.println("”””””””””””””””””");
    }
}
