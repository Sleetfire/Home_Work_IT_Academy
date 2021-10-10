package home_work_5.randomStudentLib.api;

import java.io.IOException;

public interface IRandomStudent {

    String generateRandomName() throws IOException;

    int generateRandomAge();

    double generateRandomRating();

    boolean generateRandomIsOlympiad();

}
