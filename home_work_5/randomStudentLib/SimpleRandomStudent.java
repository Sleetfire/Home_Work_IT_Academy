package home_work_5.randomStudentLib;

import home_work_5.randomStudentLib.api.IRandomStudent;

import java.util.Locale;
import java.util.Random;

public class SimpleRandomStudent implements IRandomStudent {

    private Random random = new Random();

    @Override
    public String generateRandomName() {
        StringBuilder stringBuilder = new StringBuilder();
        String str;
        boolean flag = false;
        int size = generateRandomNameSize();
        for (int i = 0; i < size; i++) {
            if (!flag) {
                flag = true;
                str = generateRandomLitter().toUpperCase(Locale.ROOT);
                stringBuilder.append(str);
            } else {
                stringBuilder.append(generateRandomLitter());
            }
        }
        return stringBuilder.toString();
    }

    @Override
    public int generateRandomAge() {
        return random.nextInt(10) + 8;
    }

    @Override
    public double generateRandomRating() {
        return random.nextDouble() * 10;
    }

    @Override
    public boolean generateRandomIsOlympiad() {
        return random.nextBoolean();
    }

    private String generateRandomLitter() {
        int numberOfLitter = random.nextInt(31) + 1072;
        return Character.toString((char) numberOfLitter);
    }

    private int generateRandomNameSize() {
        return random.nextInt(7) + 3;
    }
}
