import java.util.ArrayList;

public class FruitList {
    private ArrayList<Fruit> fruitList;

    FruitList() {
        fruitList = new ArrayList<Fruit>();
    }

    void addFruit(String objectName, double price) {
        fruitList.add(new Fruit(objectName, price));
    }

    void deleteFruit(String objectName) {
        for (int i = 0; i < fruitList.size(); i++) {
            if (objectName.equals(fruitList.get(i).getObjectName())) {
                fruitList.remove(i);
                break;
            }
        }
    }

    void printList() {
        System.out.println("----------------------");
        for (int i = 0; i < fruitList.size(); i++) {
            System.out.println(fruitList.get(i).getObjectName() + ", pris: " + fruitList.get(i).getObjectPrice() + ":-");
        }
        System.out.println("----------------------");
    }

    Fruit maxValueFruit() {
        //Metod för att beräkna högsta pris i listan.
        double max = 0;
        int index = 0;

        for (int i = 0; i < fruitList.size(); i++) {
            if (max < fruitList.get(i).getObjectPrice()) {
                max = fruitList.get(i).getObjectPrice();
                index = i;
            }

        }
        return fruitList.get(index);
    }

    Fruit minValueFruit() {
        //Metod för att beräkna lägsta pris i listan.
        double min = 10000;
        int index = 0;
        for (int i = 0; i < fruitList.size(); i++) {
            if (min > fruitList.get(i).getObjectPrice()) {
                min = fruitList.get(i).getObjectPrice();
                index = i;
            }
        }
        return fruitList.get(index);
    }
}
