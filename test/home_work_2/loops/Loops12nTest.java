package home_work_2.loops;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class Loops12nTest {

    private final Loops12n loops12n = new Loops12n();

    @Test
    @DisplayName("Перемножение всех цифр")
    void additionLoop() {
        assertEquals("1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10080", loops12n.multiplyAll("181232375"));
        assertEquals("Введено не целое число", loops12n.multiplyAll("99.2"));
        assertEquals("Введено не число", loops12n.multiplyAll("Привет"));
        assertEquals("1 * 0 = 0", loops12n.multiplyAll("10"));
        assertEquals("Введено не число", loops12n.multiplyAll("1п"));
        assertEquals("7 = 7", loops12n.multiplyAll("7"));
        assertEquals("0", loops12n.multiplyAll("0"));
        assertEquals("-1", loops12n.multiplyAll("-1"));
        assertEquals("-10", loops12n.multiplyAll("-10"));
    }
}
