package home_work_plus.notification.dto;

import home_work_plus.notification.NotificationMethods;

import java.util.List;
import java.util.Objects;

public class User {

    private String userName;
    private List<NotificationMethods> notificationMethodsList;
    private List<User> contactsList;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<NotificationMethods> getNotificationMethodsList() {
        return notificationMethodsList;
    }

    public void setNotificationMethodsList(List<NotificationMethods> notificationMethodsList) {
        this.notificationMethodsList = notificationMethodsList;
    }

    public List<User> getContactsList() {
        return contactsList;
    }

    public void setContactsList(List<User> contactsList) {
        this.contactsList = contactsList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userName, user.userName) && Objects.equals(notificationMethodsList,
                user.notificationMethodsList) && Objects.equals(contactsList, user.contactsList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, notificationMethodsList, contactsList);
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", notificationMethodsList=" + notificationMethodsList +
                ", contactsList=" + contactsList +
                '}';
    }
}


