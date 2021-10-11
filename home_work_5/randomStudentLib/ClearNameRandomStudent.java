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

    @Override
    public String generateRandomName() {
        return names[chooseRandomName()];
    }

    @Override
    public int generateRandomAge() {
        return iRandomStudent.generateRandomAge();
    }

    @Override
    public double generateRandomRating() {
        return iRandomStudent.generateRandomRating();
    }

    @Override
    public boolean generateRandomIsOlympiad() {
        return iRandomStudent.generateRandomIsOlympiad();
    }

    private int chooseRandomName() {
        Random random = new Random();
        return random.nextInt(names.length);
    }
}
