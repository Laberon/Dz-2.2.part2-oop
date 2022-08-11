public class Car implements Transport {
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
        System.out.println("Меняем колеса у машины");
        System.out.println("Меняем колеса у машины");
        System.out.println("Меняем колеса у машины");
        System.out.println("Меняем колеса у машины");
    }

    @Override
    public void checkTransport() {
        System.out.println(getModelName());
        checkEngine();
        System.out.println("С авто все ок!");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}