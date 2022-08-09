public class ServiceStation implements ServiceStationPrint {
    @Override
    public void check(Transport[] transports) {
        for (int i = 0; i < transports.length; i++) {
            Transport transport=transports[i];
            System.out.println(transport.getModelName());
            transport.updateTyre();
            transport.checkEngine();
            transport.checkTrailer();
        }
        printSeparator();
    }
    public void printSeparator() {
        System.out.println("+++++++++++++++++++++");
    }
}
