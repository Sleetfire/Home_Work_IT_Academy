package home_work_2.loops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Loops13nTest {

    private final Loops13n loops13n = new Loops13n();

    @Test
    void additional() {
        assertEquals("18.0 ^ 5 = 1889568.0", loops13n.getDegree(18, 5));
        assertEquals("7.5 ^ 2 = 56.25", loops13n.getDegree(7.5, 2));
        assertEquals("18.0 ^ 0 = 1", loops13n.getDegree(18, 0));
        assertEquals("2.0 ^ 3 = 8.0", loops13n.getDegree(2, 3));
        assertEquals("0.0 ^ 0 = 1", loops13n.getDegree(0, 0));
        assertEquals("0.0 ^ 1 = 0.0", loops13n.getDegree(0, 1));
    }
}
