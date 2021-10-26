package home_work_2.loops;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class Loops11nTest {

    private final Loops11n loops11n = new Loops11n();

    @Test
    @DisplayName("Выполнение через цикл")
    void additionLoop() {
        assertEquals("1 * 2 * 3 * 4 * 5 = 120", loops11n.multiplying("5"));
        assertEquals("1 * 2 * 3 * 4 * 5 * 6 = 720", loops11n.multiplying("6"));
        assertEquals("0", loops11n.multiplying("0"));
        assertNull(loops11n.multiplying("q"));
    }

    @Test
    @DisplayName("Выполнение через рекурсию")
    void additionRecursion() {
        assertEquals(120, loops11n.factorial(5));
        assertEquals(0, loops11n.factorial(0));
        assertEquals(0, loops11n.factorial(-1));
    }

}
