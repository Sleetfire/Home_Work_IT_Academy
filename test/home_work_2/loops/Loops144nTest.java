package home_work_2.loops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Loops144nTest {

    private final Loops144n loops144n = new Loops144n();

    @Test
    void additional() {
        assertEquals("Переполнение! Значение до переполнения: 4052555153018976267\n" +
                "Значение после переполнения: -6289078614652622815", loops144n.doOverflow(3));
        System.out.println("------------------------------------------------------------");
        assertEquals("Переполнение! Значение до переполнения: 1560496482665168896\n" +
                "Значение после переполнения: -1774566438301073408", loops144n.doOverflow(188));
        System.out.println("------------------------------------------------------------");
        assertEquals("Переполнение! Значение до переполнения: 799006685782884121\n" +
                "Значение после переполнения: 3265617043834753317", loops144n.doOverflow(-19));
        System.out.println("------------------------------------------------------------");
        assertEquals("Переполнение! Значение до переполнения: 3530945043777457216\n" +
                "Значение после переполнения: 3754582625928023168", loops144n.doOverflow(1234));
        System.out.println("------------------------------------------------------------");
        assertEquals("0", loops144n.doOverflow(0));
    }
}
