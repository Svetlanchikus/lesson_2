import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        System.out.println("Введите, пожалуйста, любое целое число");
        Scanner customValue = new Scanner(System.in);

        if (customValue.hasNextInt()) {

            String customValueString = customValue.nextLine();
            int size = customValueString.length();
            int number = Integer.parseInt(customValueString);
            System.out.println(Math.abs(number % 10));

        } else {
            System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
        }
    }
}
