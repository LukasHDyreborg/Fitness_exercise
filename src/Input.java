import java.util.Scanner;

public class Input {
    public static String inputString() {
        Scanner console = new Scanner(System.in);
        return console.next();
    }

    public static boolean inputBoolean() {
        int i = 0;
        while (i == 0) {
            String input = inputString();
            if (input.equals("True") || input.equals("true") || input.equals("Yes") || input.equals("yes") || input.equals("1")) {
                return true;
            } else if (input.equals("False") || input.equals("false") || input.equals("No") || input.equals("no") || input.equals("2")) {
                return false;
            } else {
                System.out.println("Wrong input try again!");
            }
        }
        return false;
    }

    public static int inputInt() {
        Scanner console = new Scanner(System.in);
        return console.nextInt();
    }
}
