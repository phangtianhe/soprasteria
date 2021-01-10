package console.model;

public class AlphabetZ extends Alphabet {
    public AlphabetZ(int fontSize) {
        this.fontSize = fontSize;
    }

    public void draw() {
        int i = 0;
        int j = 0;
        int count = 0;
        for (i = 0; i < fontSize; i++)
        {
            for(j = 0; j < fontSize; j++){
                // minus one because array start from 0 and fontSize is not based on array numbering
                if (j == fontSize - count - 1 || i == 0 || i == fontSize - 1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            count++;
            System.out.println();
        }
    }
}
