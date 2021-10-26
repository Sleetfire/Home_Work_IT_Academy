package home_work_1.eighthTask;

public class OperatorIf implements ICommunicationPrinter {

    @Override
    public String welcome(String name) {


        if (name.equals("Вася")) {

            return "Привет!" + '\n' + "Я тебя так долго ждал";
        }

        if (name.equals("Анастасия")) {

            return "Я тебя так долго ждал";
        }

        return "Добрый день, а вы кто?";

    }
}
