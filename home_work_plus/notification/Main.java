package home_work_plus.notification;

import home_work_plus.notification.dto.User;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        User mainUser = createNewUser();

        System.out.println("Введите количество людей, которых хотите добавить в контакты:");
        int countOfUsers = scanner.nextInt();
        List<User> userList = new ArrayList<>();
        User[] users = new User[countOfUsers];
        for (int i = 0; i < countOfUsers; i++) {
            users[i] = new User();
            System.out.println("Введите имя нового контакта:");
            users[i].setUserName(scanner.next());


        }
    }

    public static User createNewUser() {
        Scanner scanner = new Scanner(System.in);
        User user = new User();
        System.out.println("Введите имя нового пользователя: ");
        String userName = scanner.next();
        System.out.println("Способы уведомлений: ");
        NotificationMethods[] notificationMethods = NotificationMethods.values();
        for (int i = 0; i < notificationMethods.length; i++) {
            System.out.println(i + ". " + notificationMethods[i]);
        }
        int answer;
        List<NotificationMethods> notificationMethodsList = new ArrayList<>();
        do {
            System.out.println("Выберите способ:");
            answer = scanner.nextInt();
            if (answer > -1 && answer < notificationMethods.length) {
                notificationMethodsList.add(notificationMethods[answer]);
            }
        } while (answer > -1 && answer < notificationMethods.length);
        notificationMethodsList = notificationMethodsList.stream()
                .distinct()
                .collect(Collectors.toList());
        user.setUserName(userName);
        user.setNotificationMethodsList(notificationMethodsList);
        return user;
    }

}
