import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        System.out.println("Введите, пожалуйста, любое целое число");
        Scanner custom_value = new Scanner(System.in);

        if (custom_value.hasNextInt()) {

            String custom_value_string = custom_value.nextLine();
            int size = custom_value_string.length();
            int number = Integer.parseInt(custom_value_string);
            System.out.println(Math.abs(number % 10));

        } else {
            System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
        }
    }
}
