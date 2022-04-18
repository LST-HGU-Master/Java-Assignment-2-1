import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.io.*;

class Prog21Test {

    @Test
    public void testFirstSentence()
    {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        // action
        Prog21.main(new String[]{"10", "19"});

        // assertion
        String[] prints = bos.toString().split(System.lineSeparator());
        assertEquals("x=10,y=19とすると、", prints[0]); //改行でsplitしてるので改行コードは不要

        // undo the binding in System
        System.setOut(originalOut);
    }

    @Test
    public void testShikiA()
    {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        // action
        Prog21.main(new String[]{"10", "19"});

        // assertion
        String[] prints = bos.toString().split(System.lineSeparator());
        assertEquals("x+y = 29", prints[1]); //改行でsplitしてるので改行コードは不要

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
        Prog21.main(new String[]{"10", "19"});

        // assertion
        String[] prints = bos.toString().split(System.lineSeparator());
        assertEquals("y/x = 1.9", prints[2]);

        // undo the binding in System
        System.setOut(originalOut);
    }
}