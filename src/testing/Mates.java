package testing;

import java.io.File;
import java.io.IOException;

/**
 * Created by rcasamajo on 07/04/16.
 */
public class Mates {

    private int comptador;

    public Mates() {
        comptador = 0;
    }

    public int suma(int a, int b) {
        return a + b;
    }

    public void inc(int n) {
        comptador += n;
    }

    public int getComptador() {
        return comptador;
    }

    public void saveComptador() throws IOException {
        File f = new File("fitxer");
        f.createNewFile();
    }
}
