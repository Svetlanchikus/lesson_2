import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        System.out.println("Введите, пожалуйста, любое трехзначное целое число");
        Scanner customValue = new Scanner(System.in);

        if (customValue.hasNextInt()) {

            int number = customValue.nextInt();
            if (number > 99) {

                int a = 100;
                int searchValue = 0;
                if (number == 0) {
                    searchValue = number;
                }

                int d = 1;
                while (number > 0) {
                    d = number / a;
                    searchValue = searchValue + d;
                    number = number - d * a;
                    a = a / 10;
                }

                System.out.print("Сумма цифр: ");
                System.out.println(searchValue);

            } else {
                System.out.println("Извините, но это не трехзначное число. Перезапустите программу и попробуйте снова!");
            }

        } else {
            System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
        }
    }
}