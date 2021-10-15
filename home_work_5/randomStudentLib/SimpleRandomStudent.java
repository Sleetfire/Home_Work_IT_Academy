package home_work_5.randomStudentLib;

import home_work_5.randomStudentLib.api.IRandomStudent;

import java.util.Locale;
import java.util.Random;

public class SimpleRandomStudent implements IRandomStudent {

    private Random random = new Random();

    /**
     * метод, который возвращает случайное имя
     * @return возвращает случайные русские символы в виде строки длиной от 3 до 10
     */
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

    /**
     * метод, который генерирует случайный возраст
     * @return возвращает возраст от 8 до 17
     */
    @Override
    public int generateRandomAge() {
        return random.nextInt(10) + 8;
    }

    /**
     * метод, который генерирует случайную оценку
     * @return возвращает оценку от 0 до 10
     */
    @Override
    public double generateRandomRating() {
        return random.nextDouble() * 10;
    }

    /**
     * метод, который генерирует участие в олимпиаде
     * @return возвращает либо true, либо false
     */
    @Override
    public boolean generateRandomIsOlympiad() {
        return random.nextBoolean();
    }

    /**
     * метод, который генерирует случайную русскую букву ('ё' не учитывается, так как в русском языке можно обойтись без нее)
     * @return возвращает русскую букву от 'а' до 'я' (без учета 'ё')
     */
    private String generateRandomLitter() {
        int numberOfLitter = random.nextInt(32) + 1072;
        return Character.toString((char) numberOfLitter);
    }

    /**
     * метод, который генерирует случайную длину имени от 3 до 10 (в random.nextInt(8) стоит 8, так как иначе не будет получаться число 10)
     * @return возвращает число от 3 до 10
     */
    private int generateRandomNameSize() {
        return random.nextInt(8) + 3;
    }
}
