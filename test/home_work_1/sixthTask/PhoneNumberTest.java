package home_work_1.sixthTask;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneNumberTest {

    private final int [] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
    private final int [] array2 = {3, 7, 5, 4, 4, 5, 7, 1, 1, 8};

    @Test
    void addition() {
        assertEquals("(123) 456-7890", PhoneNumber.createPhoneNumber(array1));
        assertEquals("(375) 445-7118", PhoneNumber.createPhoneNumber(array2));
    }
}
