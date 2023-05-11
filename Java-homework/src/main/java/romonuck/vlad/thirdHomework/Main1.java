package romonuck.vlad.thirdHomework;
/*
Завдання 1
Створити клас користувача соц мережі User. Задати поля даному класу: id, email та password.
Придумати як можна задати поведінку об’єктам даного класу, наприклад створити поле Boolean isAuthenticated та метод,
який буде задавати значення цій змінній при перевірці полів email та password – true або false.
Також можна придумати певні дані, доступ до яких буде надаватися згідно того, чи аутентифікований юзер.
 */
public class Main1 {
    public static void main(String[] args) {
        //true
        User user1 = new User(1, "romonuck@yaya.net", "PasFSfNMcc_$ds");
        System.out.println(user1.isAuthenticated());

        //false
        User user2 = new User();
        System.out.println(user2.isAuthenticated());
        //false
        User user3 = new User(2,"kek@sheeesh.com");
        System.out.println(user3.isAuthenticated());
    }
}

