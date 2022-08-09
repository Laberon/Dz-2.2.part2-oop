public class Transport {
    private String modelName;

    private int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }
    public String getModelName() {
        return modelName;
    }
    public void updateTyre() {
        if (wheelsCount >= 2) {
            System.out.println("Меняем покрышки "+wheelsCount+" шт");
        } else if (wheelsCount < 2) {
            System.out.println("Проверь колличество колес");
        }
    }
    public void checkEngine() {
        if (wheelsCount >= 4) {
            System.out.println("Проверяем двигатель");
        }
    }
    public void checkTrailer() {
        if (wheelsCount >= 6) {
            System.out.println("Проверяем прицеп");
        }
    }
}
