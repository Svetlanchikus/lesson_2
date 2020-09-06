import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        System.out.println("Введите, пожалуйста, любое целое число (можно отрицательное)");
        Scanner custom_value = new Scanner(System.in);
        if (custom_value.hasNextInt()) {

            int number = custom_value.nextInt();
            if (number >= 0){
                System.out.println(number + 1);
            } else {
                System.out.println(number);
            }

        } else {
            System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
        }
    }
}
