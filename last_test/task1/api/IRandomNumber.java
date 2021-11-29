package last_test.task1.api;

public interface IRandomNumber<T> {

    /**
     * Метод, который генерирует случайное число
     *
     * @param range диапазон, из которого будет сгенерировано число
     * @return число
     */
    T generateRandomNumber(int range);
}
