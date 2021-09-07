package eighthTask;



public class OperatorIfElseIf implements ICommunicationPrinter {

    @Override
    public String welcome(String name) {

        if (name.equals("Вася")) {
            return "Привет!" + '\n' + "Я тебя так долго ждал";

        } else if (name.equals("Анастасия")) {
            return "Я тебя так долго ждал";

        } else return "Добрый день, а вы кто?";

    }
}
