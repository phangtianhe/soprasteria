package console.function;

import console.model.*;

public class CommandProcessor {

    public static void processInput(String inputCommand) {
        if (inputCommand == null || inputCommand.isEmpty()) {
            throw new IllegalArgumentException("Input command is empty or null");
        }

        String[] arguments = inputCommand.split(" ");

        if (arguments.length != 2) {
            throw new IllegalArgumentException("Input command must be 2 argument length");
        }

        int size;

        try {
            size = Integer.parseInt(arguments[1]);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Size must be odd number between 3 to 21 inclusive");
        }

        if (size < 3 || size > 21 || size % 2 != 1){
            throw new IllegalArgumentException("Size must be odd number between 3 to 21 inclusive");
        }

        Alphabet alphabet;

        switch (arguments[0].toUpperCase()) {
            case "X":
                alphabet = new AlphabetX(size);
                break;
            case "Y":
                alphabet = new AlphabetY(size);
                break;
            case "Z":
                alphabet = new AlphabetZ(size);
                break;
            case "A":
                alphabet = new AlphabetA(size);
                break;
            case "U":
                alphabet = new AlphabetU(size);
                break;
            default:
                throw new IllegalArgumentException("Unsupported alphabet");
        }

        alphabet.draw();
    }
}
