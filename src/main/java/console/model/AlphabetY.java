package console.model;

public class AlphabetY extends Alphabet {
    public AlphabetY(int fontSize) {
        this.fontSize = fontSize;
    }

    public void draw() {
        int i = 0;
        int j = 0;
        int count = 0;
        int midPoint = 0;

        for (i = 0; i < fontSize; i++) {
            for (j = 0; j < fontSize; j++) {
                // To draw up the portion from middle dot to upper section
                if (i < (fontSize / 2) + 1) {
                    // minus one because array start from 0 and fontSize is not based on array numbering
                    if (j == count || j == fontSize - count - 1) {
                        System.out.print("*");
                        midPoint = count;
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    // Draw the line below the middle dot
                    if (j == midPoint) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            count++;
            System.out.println();
        }
    }
}
