import java.util.ArrayList;
import java.util.Scanner;

public class HelperClass {

    // makes the text be in the middle
    public static void countMidt(String text) {
        int value = text.length();
        int numberX = 120 - value;
        line(numberX, text);
    }

    // makes the text be on the left
    public static void countStart(String text) {
        int value = text.length();
        int numberX = 120 - value;
        emptyLine(numberX, text);
    }

    // Makes the setup for Menus
    public static int choiceNumber(int value) {
        int i = 0;
        while (i == 0) {
            String choice = input();
            try {
                for (int j = 1; j <= value; j++) {
                    int choice2 = Integer.parseInt(choice);
                    if (choice2 == j) {
                        i = 1;
                        return choice2;
                    }
                }
            } catch (NumberFormatException e) {
                countStart("Invalid Input! Please try again!");
            }
        }
        return 0;
    }

    // This method is for creating a empty line
    public static void emptyLine(int number, String text) {
        int number1 = 0;
        System.out.print("|");
        for (int i = 0; i <= number1; i++) {
            System.out.print(" ");
        }
        System.out.print(text);
        for (int i = 0; i <= number; i++) {
            System.out.print(" ");
        }
        System.out.println("|");
    }

    // This method is for creating the header.
    public static void header(String text) {
        line(120, "");
        countMidt(text);
        line(120, "");
        pause(500);
    }

    // returns an input from console
    public static String input() {
        Scanner console = new Scanner(System.in);
        System.out.print("| ");
        String text = console.next();
        line(120, "");
        return text;
    }

    public static Boolean inputBoolean(String... args) {
        int i = 0;
        while (i == 0) {

            String choice = inputLowercase(args);

            if (choice.equals("true")) {
                return true;
            } else if (choice.equals("false")) {
                return false;
            } else {
                countStart("Wrong Input! Please try again");
            }
        }
        return false;
    }

    public static int inputInt(String... args) {
        int i = 0;
        while (i == 0) {

            String choice = inputLowercase(args);

            try {
                return Integer.parseInt(choice);
            } catch (NumberFormatException e1) {
                countStart("Wrong input! Please try again!");
            }
        }
        return 0;
    }

    public static boolean inputIntAsBoolean() {
        int choice = inputInt();
        if (choice == 1) {
            return true;
        } else if (choice == 2) {
            return false;
        } else {
            countStart("Wrong input! Please try again!");
        }
        return false;
    }

    // Writes text and takes Input in console and makes it lowercase
    public static String inputLineLowercase(String... args) {
        for (String s : args) {
            HelperClass.countStart(s);
        }
        Scanner console = new Scanner(System.in);
        System.out.print("| ");
        String text = console.nextLine().toLowerCase();
        HelperClass.line(120, "");
        return text;
    }

    // Writes text and takes Input in console and makes it lowercase
    public static String inputLowercase(String... args) {
        for (String s : args) {
            countStart(s);
        }
        Scanner console = new Scanner(System.in);
        System.out.print("| ");
        String text = console.next().toLowerCase();
        line(120, "");
        return text;
    }

    // This method is for creating a line
    public static void line(int number, String text) {
        int number1 = (number / 2);
        int number2 = modulo(number);
        System.out.print("|");
        for (int i = 0; i <= number1; i++) {
            System.out.print("-");
        }
        System.out.print(text);
        for (int i = 0; i <= number2; i++) {
            System.out.print("-");
        }
        System.out.println("|");
    }

    // Writes a number of Strings
    public static void listWriteOut(String... args) {
        for (String s : args) {
            countStart(s);
        }
    }

    // menu header
    public static void menuHeader(String text) {
        countMidt(text);
        line(120, "");
        pause(500);
    }

    // receives all Strings and then goes through them all
    public static int menuWriteOut(int value, String... args) {
        for (String s : args) {
            countStart(s);
        }
        return choiceNumber(value);
    }

    // This method calculates if a number is even or uneven
    public static int modulo(int number) {
        if (number % 2 == 0) {
            return number / 2;
        } else {
            return (number / 2) + 1;
        }
    }

    // Waits half a second.
    public static void pause(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            System.out.println("The thread could not be put to sleep zzzz!");
        }
    }

    // Prints the list of whatever ArrayList
    public static void printLists(ArrayList<?> list) { //<?> accepts any type of arraylists. Enables us to use same method to print out all arrayLists (at least in theory);
        if (list.size() == 0) {
            System.out.println("The list is empty");
        } else
            for (Object e : list) {
                System.out.println(e); //prints objects out
                line(120, "");
            }
    }
}