package console;

import java.util.Scanner;

import static console.function.CommandProcessor.processInput;

public class Main {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        while (keyboardInput.hasNext()) {
            String input = keyboardInput.nextLine();
            // Trim the ends
            input = input.trim();

            // If got multi whitespaces between command also reduce them
            input = input.replaceAll(" +", " ");

            try {
                // Q input command will terminate application
                if (input.equals("Q")) {
                    break;
                }

                // process input and throw illegalArgument if not a valid command
                processInput(input);
            } catch (IllegalArgumentException iaex) {
                System.out.println(iaex.getMessage());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        keyboardInput.close();
    }
}
