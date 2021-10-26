package home_work_1.fourthTask;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class SleepTest {

    @Test
    void sum() {
        assertEquals(true, Sleep.sleepIn2(false, false));
        assertEquals(false, Sleep.sleepIn2(true, false));
        assertEquals(true, Sleep.sleepIn2(false, true));
        assertEquals(true, Sleep.sleepIn2(true, true));
    }
}
