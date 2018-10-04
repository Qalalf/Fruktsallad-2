public class Fruit {
    private String name;
    private double price;

    Fruit(String inputObjectName, double inputPrice) {
        name = inputObjectName;
        price = inputPrice;
    }

    String getObjectName() {
        return name;
    }

    double getObjectPrice() {
        return price;
    }
}

