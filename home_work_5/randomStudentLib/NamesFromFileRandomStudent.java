package home_work_5.randomStudentLib;

import home_work_5.randomStudentLib.api.IRandomStudent;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NamesFromFileRandomStudent implements IRandomStudent {

    private IRandomStudent iRandomStudent;
    private List<String> list = new ArrayList<>();

    public NamesFromFileRandomStudent(IRandomStudent iRandomStudent) {
        this.iRandomStudent = iRandomStudent;
    }

    /**
     * метод, который возвращает случайное имя
     * @return возвращает случайное русское имя, прочитанное из файла
     */
    @Override
    public String generateRandomName() {
        return this.list.get(chooseRandomNameFromFile());
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
     * метод, который считывает имена из файла в поле list
     */
    private void readFromFile() {
        String path = "src/home_work_5/randomStudentLib/names.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String str;
            while ((str = reader.readLine()) != null) {
                if (!str.isEmpty()) {
                    list.add(str);
                }
            }
        } catch (IOException e1) {
            System.out.println(e1.getMessage());
        }
    }

    /**
     * метод, который выбирает номер элемента из списка list
     * @return возвращает число от 0 до размера поля list
     */
    private int chooseRandomNameFromFile() {
        readFromFile();
        Random random = new Random();
        return random.nextInt(list.size() - 1);
    }
}
