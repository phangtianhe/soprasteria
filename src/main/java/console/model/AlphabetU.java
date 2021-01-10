package console.model;

public class AlphabetU extends Alphabet {

    public AlphabetU(int fontSize){
        this.fontSize = fontSize;
    }

    public void draw(){
        int width = fontSize + 2; // Based on assumption that alphabet A do not need to be width == height as size to preserve alphabet shape
        int i = 0;
        int j = 0;
        int count = 0;
        for (i = 0; i < fontSize; i++) {
            for (j = 0; j < width; j++) {
                if ((i != fontSize - 1 && (j == 0 || j == width - 1)) || (i == fontSize - 1 && (j > 0 && j < width - 1))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            count++;
            System.out.println();
        }
    }
}
