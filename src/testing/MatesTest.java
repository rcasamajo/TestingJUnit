package testing;

import org.junit.*;

import java.io.File;

import static org.junit.Assert.*;

/**
 * Created by rcasamajo on 07/04/16.
 */
public class MatesTest {

    private Mates m;

    @Before
    public void setUp() {
        m = new Mates();
    }

    @Test
    public void suma() throws Exception {
        assertEquals(m.suma(-1, 1), 0);
        assertNotEquals(m.suma(1, 1), 0);
    }

    @Test
    public void inc() throws Exception {
        int num = m.getComptador();
        m.inc(5);
        assertEquals(m.getComptador(), num+5);
    }

    @Test
    public void saveComptador() throws Exception {
        m.saveComptador();
        File f = new File("fitxer");
        if (!f.exists())
            fail("El fitxer no existeix");
    }
}