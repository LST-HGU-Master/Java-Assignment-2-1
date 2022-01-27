import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.io.*;

class Prog21Test {
    @Test
    public void testShikiA()
    {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        // action
        Prog21.main(null);

        // assertion
        String[] prints = bos.toString().split("\n");
        assertEquals("x+y = 9", prints[1]); //改行でsplitしてるので改行コードは不要

        // undo the binding in System
        System.setOut(originalOut);
    }

    @Test
    public void testShikiB()
    {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        // action
        Prog21.main(null);

        // assertion
        String[] prints = bos.toString().split("\n");
        assertEquals("y/x = 3.5", prints[2]);

        // undo the binding in System
        System.setOut(originalOut);
    }
}