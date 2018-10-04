import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ObjectList list = new ObjectList();
    static boolean isRunning = true;

    public static void main(String[] args) {
        do {
            introText();
            getOption();
        } while (isRunning);

    }

    static void introText() {
        System.out.println("\nVälkommen till detta program");
        System.out.println();
        System.out.println("1 - Lägg till vara");
        System.out.println("2 - Ta bort vara");
        System.out.println("3 - Visa lista");
        System.out.println("4 - Visa dyraste och billigaste varan");
        System.out.println("5 - Stäng programmet");
    }

    static void getOption() {
        System.out.println("Skriv in ditt val här: ");
        int input = scanner.nextInt();

        switch (input) {
            case 1:
                addObjects();
                break;
            case 2:
                System.out.println("Skriv in varans namn som ska tas bort: ");
                String objectName = scanner.next();
                list.deleteObject(objectName);
                break;
            case 3:
                list.printList();
                break;

            case 4:
                Fruits maxObject = list.maxValueObject();
                Fruits minObject = list.minValueObject();
                System.out.println("Dyraste varan är " + maxObject.getObjectName() + " för " + maxObject.getObjectPrice() + ":-");
                System.out.println("Billigaste varan är " + minObject.getObjectName() + " för " + minObject.getObjectPrice() + ":-");
                break;

            case 5:
                System.out.println("Stänger ner...");
                isRunning = false;
                break;
        }
    }

    static void addObjects() {
        while (true) {
            System.out.println("Skriv in namn: ");
            String name = scanner.next();
            System.out.println("Skriv in pris: ");
            double price = scanner.nextDouble();

            list.addObject(name, price);

            System.out.println("Fortsätta lägga till varor?\ny/n: ");
            String input = scanner.next();

            if (input.equals("n")) {
                break;
            }


        }
    }
}
