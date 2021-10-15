package home_work_5.randomStudentLib;

import home_work_5.randomStudentLib.api.IRandomStudent;

import java.util.Random;

public class ClearNameRandomStudent implements IRandomStudent {

    private IRandomStudent iRandomStudent;

    private String[] names = {"Александр", "Артем", "Иван", "Сергей", "Никита", "Матвей", "Кирилл", "Дмитрий", "Даниил", "Марк", "Богдан", "Арсений",
            "Роман", "Максим", "Егор", "Алексей", "Тимур", "Константин", "Павел", "Владимир", "Андрей", "Мирон", "Владислав", "Тимофей",
            "Ярослав", "Михаил", "Макар", "Илья", "Станислав"};

    public ClearNameRandomStudent(IRandomStudent iRandomStudent) {
        this.iRandomStudent = iRandomStudent;
    }

    /**
     * метод, который возвращает случайное имя
     * @return возвращает случайные русские имена из поля names
     */
    @Override
    public String generateRandomName() {
        return this.names[chooseRandomName()];
    }

    @Override
    public int generateRandomAge() {
        return this.iRandomStudent.generateRandomAge();
    }

    @Override
    public double generateRandomRating() {
        return this.iRandomStudent.generateRandomRating();
    }

    @Override
    public boolean generateRandomIsOlympiad() {
        return this.iRandomStudent.generateRandomIsOlympiad();
    }

    /**
     * метод, который выбирает случайное имя из поля names
     * @return возвращает русское имя
     */
    private int chooseRandomName() {
        Random random = new Random();
        return random.nextInt(names.length);
    }
}
