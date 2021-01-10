package console.function;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static console.function.CommandProcessor.processInput;

public class CommandProcessorTest {

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void shouldThrowIllegalArgumentIfInputNull(){
        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("Input command is empty or null");
        processInput(null);
    }

    @Test
    public void shouldThrowIllegalArgumentIfInputEmpty(){
        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("Input command is empty or null");
        processInput("");
    }

    @Test
    public void shouldThrowIllegalArgumentIfInputNotExactly2Argument(){
        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("Input command must be 2 argument length");
        processInput("Z 5 5");
    }

    @Test
    public void shouldThrowIllegalArgumentIfInputIsNotAsupportedAlphabet(){
        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("Unsupported alphabet");
        processInput("G 5");
    }

    @Test
    public void shouldThrowIllegalArgumentIfInputForSizeIsNotANumber(){
        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("Size must be odd number between 3 to 21 inclusive");
        processInput("Z Z");
    }

    @Test
    public void shouldThrowIllegalArgumentIfInputIsNotOddNumberInAcceptableRange(){
        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("Size must be odd number between 3 to 21 inclusive");
        processInput("Z 99");
    }
}
