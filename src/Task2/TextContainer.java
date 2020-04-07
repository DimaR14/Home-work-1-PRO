package Task2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

@SaveTo
public class TextContainer {
    private String s;

    public TextContainer(String s) {
        this.s = s;
    }

    @Save
    public void save(String path) throws FileNotFoundException {
        PrintWriter x = new PrintWriter(path);
        try {
            x.write(s);
        } finally {
            x.close();
        }
    }
}