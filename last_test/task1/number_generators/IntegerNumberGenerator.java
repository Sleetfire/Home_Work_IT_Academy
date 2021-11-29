package last_test.task1.number_generators;

import last_test.task1.api.IRandomNumber;

import java.util.concurrent.ThreadLocalRandom;

public class IntegerNumberGenerator implements IRandomNumber<Integer> {

    /**
     * Метод, который генерирует случайное целочисленное число
     * @param range диапазон, из которого будет сгенерировано число
     * @return целочисленное число
     */
    @Override
    public Integer generateRandomNumber(int range) {
        return ThreadLocalRandom.current().nextInt(range);
    }
}
