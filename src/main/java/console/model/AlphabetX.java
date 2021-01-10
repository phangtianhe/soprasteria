package console.model;

public class AlphabetX extends Alphabet {

    public AlphabetX(int fontSize){
        this.fontSize = fontSize;
    }

    public void draw(){
        int i = 0;
        int j = 0;
        int count = 0;
        for (i = 0; i < fontSize; i++)
        {
            // printing the horizontal *
            for(j = 0; j < fontSize; j++){
                // minus one because array start from 0 and fontSize is not based on array numbering
                if (j == count || j == fontSize - count - 1){
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
