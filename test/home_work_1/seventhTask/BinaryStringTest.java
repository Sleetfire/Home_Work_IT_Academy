package home_work_1.seventhTask;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryStringTest {

    @Test
    void additional() {
        assertEquals("00101010", BinaryString.toBinaryString((byte) 42));
        assertEquals("00001111", BinaryString.toBinaryString((byte) 15));
        assertEquals("11010110", BinaryString.toBinaryString((byte) -42));
        assertEquals("11110001", BinaryString.toBinaryString((byte) -15));
    }
}
