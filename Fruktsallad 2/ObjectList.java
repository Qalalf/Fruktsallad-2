import java.util.ArrayList;

public class ObjectList {
    private ArrayList<Fruits> oList;

    public ObjectList() {
        oList = new ArrayList<Fruits>();
    }

    public void addObject(String objectName, double price) {
        oList.add(new Fruits(objectName, price));
    }

    public void deleteObject(String objectName) {
        for (int i = 0; i < oList.size(); i++) {
            if (objectName.equals(oList.get(i).getObjectName())) {
                oList.remove(i);
                break;
            }
        }
    }

    public void printList() {
        for (int i = 0; i < oList.size(); i++) {
            System.out.println(oList.get(i).getObjectName() + ", pris: " + oList.get(i).getObjectPrice() + ":-");
        }
    }

    public Fruits maxValueObject() {
        double max = 0;
        int index = 0;

        for (int i = 0; i < oList.size(); i++) {
            if (max < oList.get(i).getObjectPrice()) {
                max = oList.get(i).getObjectPrice();
                index = i;
            }

        }
        return oList.get(index);
    }

    public Fruits minValueObject() {
        double min = 10000;
        int index = 0;
        for (int i = 0; i < oList.size(); i++) {
            if (min > oList.get(i).getObjectPrice()) {
                min = oList.get(i).getObjectPrice();
                index = i;
            }
        }
        return oList.get(index);
    }
}
