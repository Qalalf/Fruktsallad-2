import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static FruitList list = new FruitList();
    static boolean isRunning = true;

    public static void main(String[] args) {
        introText();

        do {
            menuText();
            getOption();
        } while (isRunning);

    }

    static void introText() {

        System.out.println("____________________________________________________________________________________________\n");
        System.out.println("Välkommen till detta fruktsallads-program för att beräkna dyraste och billigaste varan.");
        System.out.println("(Ett tips är att börja med att skapa en lista av frukt.)");
        System.out.println("____________________________________________________________________________________________");
    }

    static void menuText() {

        System.out.println();
        System.out.println("- Ange en siffra enligt alternativen nedan för att gå vidare -");
        System.out.println();
        System.out.println("1 - Lägg till vara");
        System.out.println("2 - Ta bort vara");
        System.out.println("3 - Visa lista");
        System.out.println("4 - Visa dyraste och billigaste varan");
        System.out.println("5 - Stäng programmet");
        System.out.println();
    }

    static void getOption() {
        //Metod för att läsa input från användaren och "köra" kod utifrån val.
        System.out.println("Skriv in ditt val här: ");
        int input = scannerIntCheck();

        switch (input) {
            case 1:
                addFruits();
                break;
            case 2:
                System.out.println("Skriv in varans namn som ska tas bort: ");
                String fruitName = scanner.next();
                list.deleteFruit(fruitName);
                break;
            case 3:
                list.printList();
                waitForInput();
                break;

            case 4:
                System.out.println();
                System.out.println("----------------------------------------------");
                Fruit maxObject = list.maxValueFruit();
                Fruit minObject = list.minValueFruit();
                System.out.println("Dyraste varan är " + maxObject.getObjectName() + " för " + maxObject.getObjectPrice() + ":-");
                System.out.println("Billigaste varan är " + minObject.getObjectName() + " för " + minObject.getObjectPrice() + ":-");
                System.out.println("----------------------------------------------");
                waitForInput();
                break;

            case 5:
                System.out.println("Stänger ner...");
                isRunning = false;
                break;
        }

    }

    static void addFruits() {
        //Kod för att skapa fruktobjekt
        while (true) {
            System.out.println("Skriv in varans namn: ");
            String name = scanner.next();
            System.out.println("Skriv in varans pris (utan ändelsen kr): ");
            double price = scannerDoubleCheck();
            list.addFruit(name, price);
            System.out.println("Fortsätta lägga till varor?\ny/n: ");
            String input = scanner.next();

            if (input.equals("n")) {
                break;
            }


        }
    }

    static int scannerIntCheck() {
        //Metod för att avgöra att input är av varabeltyp int. Annars ges felmeddelande.
        int input = 0;

        try {
            input = scanner.nextInt();

        } catch (Exception e) {
            System.out.println("Du måste ange en siffra!");
            scanner.next();
        }
        return input;
    }

    static double scannerDoubleCheck() {
        //Metod för att avgöra att input är av varabeltyp double. Annars ges felmeddelande.
        double input = 0.0;
        boolean isTesting = false;
        do {

            try {
                input = scanner.nextDouble();
                isTesting = false;

            } catch (Exception e) {
                System.out.println("Du måste ange en siffra!");
                scanner.next();
                isTesting = true;
            }
        } while (isTesting);
        return input;
    }

    static void waitForInput() {
        //Metod för att "pausa" programmet tills 'y' skrivs in.
        String input = "";

        while (!input.equals("y")) {
            System.out.println("\nSkriv 'y' för att gå vidare");
            input = scanner.next();
        }
    }
}
