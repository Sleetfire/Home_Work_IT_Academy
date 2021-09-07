package eighthTask;

import java.util.Scanner;

public class OperatorSwitch implements ICommunicationPrinter {

    @Override
    public String welcome(String name) {

        switch (name) {

            case "Вася":
                return "Привет!" + '\n' + "Я тебя так долго ждал";

            case "Анастасия":
                return "Я тебя так долго ждал";

            default:
                return "Добрый день, а вы кто?";

        }

    }

}
