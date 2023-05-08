package romonuck.vlad.secondHomeWork;

import java.util.Scanner;

/*
Завдання 4
Написати цикл, в якому ваше будь-яке число буде множитись саме на себе певну кількість разів.
Якщо добуток перевищить 1000, перервати цикл. Порахувати кількість ітерацій і вивести цю кількість на екран.
 */
public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть число котре буде множитись саме на себе: ");
        int userInt = scanner.nextInt();
        int temp = userInt;
        int timesOfIteration = 0;
        while (userInt<=1000){
            userInt = userInt * temp;
            ++timesOfIteration;
        }
        System.out.println("timesOfIteration: " + timesOfIteration);
    }
}
