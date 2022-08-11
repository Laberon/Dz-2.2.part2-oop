public class Bicycle implements Transport{
    private String modelName;
    private int wheelsCount;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышки у велосипеда");
        System.out.println("Меняем покрышки у велосипеда");
    }

    @Override
    public void checkTransport() {
        System.out.println(getModelName());
        System.out.println("С великом все ок");
    }
}