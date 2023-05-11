package romonuck.vlad.thirdHomework;

import java.util.Scanner;

/*
Завдання 4
Створити клас Robot. Задати йому стан з декількох полів, наприклад:
рівень заряду, активний, сон, вимкнений… Створити декілька методів для
визначення поведінки об’єкту. Протестувати власну розробку.
 */
public class Main4 {
    public static void main(String[] args) {

        Robot robot = new Robot(41, true, true, true, "Hikka");
        System.out.println(robot.getBattery());
        System.out.println(robot.myParameters());

        System.out.println("Would u like to create ur robot and my friend?\njust press Y or N: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Robot robot1 = null;
        if (s.equals("Y")) {
            robot1 = new Robot();
            System.out.println("Thanks!!!\n" +
                    "Name of our new friend is: ");
            robot1.setName(scanner.nextLine());
            System.out.println("How many % of battery he has? ");
            robot1.setBattery(scanner.nextInt());
            if (robot1.getBattery() <= 0) {
                System.out.println("I`m " + robot1.getName() + "!!! I need more power HAHAHA. Give me more battery  power!!!");
                robot1.setBattery(scanner.nextInt());
            }
            if (robot1.getBattery() > 100) {
                System.out.println("I`m " + robot1.getName() + "!!! It`s too much even for me. Give me <100 pls");
                robot1.setBattery(scanner.nextInt());
            }
            if (robot1.getBattery() > 70 && robot1.getBattery() < 100) {
                robot1.setActive(true);
                robot1.setOff(false);
                robot1.setSleep(false);
            }
            if (robot1.getBattery() > 40 && robot1.getBattery() < 70) {
                robot1.setActive(false);
                robot1.setOff(false);
                robot1.setSleep(true);
            }
            if (robot1.getBattery() > 10 && robot1.getBattery() < 40) {
                robot1.setActive(false);
                robot1.setOff(true);
                robot1.setSleep(false);
            }
        } else {
            System.out.println("((( bye.");
        }
        if (robot1 != null){
            System.out.println("Cool. Now I have a GOOOd friend!");
            System.out.println(robot1.myParameters());
        }
    }
}
