import java.util.ArrayList;

public class ObjectList {
    private ArrayList<Fruit> fruitList;

    ObjectList() {
        fruitList = new ArrayList<Fruit>();
    }

    void addObject(String objectName, double price) {
        fruitList.add(new Fruit(objectName, price));
    }

    void deleteObject(String objectName) {
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

    Fruit maxValueObject() {
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

    Fruit minValueObject() {
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
