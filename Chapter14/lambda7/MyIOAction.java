package lambda7;

import java.io.BufferedReader;
import java.io.IOException;

public interface MyIOAction {
    boolean ioAction(BufferedReader rdr) throws IOException;
}