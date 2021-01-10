package console.model;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class AlphabetYTest {
    // To be able to test on printed output
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void shouldDrawYFontSize5Correctly(){
        Alphabet alphabet = new AlphabetY(5);
        alphabet.draw();
        Assert.assertEquals(
                "*   *\r\n" +
                        " * * \r\n" +
                        "  *  \r\n" +
                        "  *  \r\n" +
                        "  *  \r\n", outContent.toString());
    }

    @Test
    public void shouldDrawYFontSize7Correctly(){
        Alphabet alphabet = new AlphabetY(7);
        alphabet.draw();
        Assert.assertEquals(
                "*     *\r\n" +
                        " *   * \r\n" +
                        "  * *  \r\n" +
                        "   *   \r\n" +
                        "   *   \r\n" +
                        "   *   \r\n" +
                        "   *   \r\n", outContent.toString());
    }
}