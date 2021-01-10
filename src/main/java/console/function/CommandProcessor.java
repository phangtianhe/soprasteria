package console.function;

import console.model.AlphabetX;

import java.util.Arrays;
import java.util.List;

public class CommandProcessor {

    public static void processInput(String inputCommand) {
        if (inputCommand == null || inputCommand.isEmpty()) {
            throw new IllegalArgumentException("Input command is empty or null");
        }

        String[] arguments = inputCommand.split(" ");

        if (arguments.length != 2) {
            throw new IllegalArgumentException("Input command must be 2 argument length");
        }

        List<String> acceptableAlphabet = Arrays.asList("X", "Y", "Z", "A", "U");

        String alphabet = arguments[0].toUpperCase();

        if (!acceptableAlphabet.contains(alphabet)) {
            throw new IllegalArgumentException("Unsupported alphabet");
        }


        int size = 0;

        try {
            size = Integer.parseInt(arguments[1]);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Size must be odd number between 3 to 21 inclusive");
        }

        if (size < 3 || size > 21 || size % 2 != 1){
            throw new IllegalArgumentException("Size must be odd number between 3 to 21 inclusive");
        }

        // TODO: call the functions to print
    }
}
