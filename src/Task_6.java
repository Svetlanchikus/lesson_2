import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        System.out.println("Введите, пожалуйста, любое целое число (можно отрицательное)");
        Scanner customValue = new Scanner(System.in);

        if (customValue.hasNextInt()) {
            int number = customValue.nextInt();
            if (number == 0) {
                System.out.println("Нулевое число");
            } else {
                if (number > 0) {
                    System.out.print("Положительное ");
                } else {
                    System.out.print("Отрицательное ");
                }

                if ((number % 2) == 0) {
                    System.out.print("четное число");
                } else {
                    System.out.print("нечетное число");
                }
            }

        } else {
            System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
        }
    }
}
