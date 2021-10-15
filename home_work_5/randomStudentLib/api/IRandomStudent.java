package home_work_5.randomStudentLib.api;

public interface IRandomStudent {

    /**
     * метод, который генерирует случайное имя
     * @return возвращает строку
     */
    String generateRandomName();

    /**
     * метод, который генерирует случайный возраст
     * @return возвращает возраст
     */
    int generateRandomAge();

    /**
     * метод, который генерирует случайную оценку
     * @return возвращает оценку
     */
    double generateRandomRating();

    /**
     * метод, который генерирует участие в олимпиаде
     * @return возвращает true, если студент участвовал в олимпиаде, false - если не участвовал
     */
    boolean generateRandomIsOlympiad();

}
