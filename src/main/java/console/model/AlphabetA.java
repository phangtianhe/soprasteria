package console.model;

public class AlphabetA extends Alphabet {

    public AlphabetA(int fontSize){
        this.fontSize = fontSize;
    }

    public void draw(){
        int width = (fontSize * 2) - 1; // Based on assumption that alphabet A do not need to be width == height as size to preserve alphabet shape
        int i = 0;
        int j = 0;
        int countLeft = fontSize - 1; // fontSize will be the middle section of width (-1 since arr starts at 0)
        int countRight = fontSize - 1;
        for (i = 0; i < fontSize; i++) {
            for (j = 0; j < width; j++) {
                if (j == countLeft ||
                        j == countRight ||
                        (i == fontSize/2 && j > countLeft && j < countRight)) { // Condition to print the middle line
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            countLeft--;
            countRight++;
            System.out.println();
        }
    }
}