

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class pruebasTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class pruebasTest
{
    /**
     * Default constructor for test class pruebasTest
     */
    public pruebasTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    /* Clase de prueba para la clase Pruebas, que verifica que todos los 
       caminos del método son correctos. */
    @Test
    public void pruebaMetodo()
    {
        assertEquals(-1, pruebas.paraProbar(3));
        assertEquals(10, pruebas.paraProbar(8));
        assertEquals(8, pruebas.paraProbar(7));
    }
}

