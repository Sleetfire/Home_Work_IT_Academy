package eighthTask;

public class TestMain {

    public static void main(String[] args) {

        System.out.println("_______________if_______________");
        OperatorIf operatorIf = new OperatorIf();
        System.out.println(operatorIf.welcome("Вася"));
        System.out.println(operatorIf.welcome("Анастасия"));
        System.out.println(operatorIf.welcome("Итачи"));

        System.out.println("_______________ifElseIf_______________");
        OperatorIfElseIf operatorIfElseIf = new OperatorIfElseIf();
        System.out.println(operatorIfElseIf.welcome("Вася"));
        System.out.println(operatorIfElseIf.welcome("Анастасия"));
        System.out.println(operatorIfElseIf.welcome("Обито"));

        System.out.println("_______________switch_______________");
        OperatorSwitch operatorSwitch = new OperatorSwitch();
        System.out.println(operatorSwitch.welcome("Вася"));
        System.out.println(operatorSwitch.welcome("Анастасия"));
        System.out.println(operatorSwitch.welcome("Мадара"));

    }

}
