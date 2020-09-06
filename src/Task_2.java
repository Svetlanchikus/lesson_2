import java.util.Scanner;

public class Task_2
{
    public static void main(String[] args) {
        System.out.println("Введите, пожалуйста, любое трехзначное целое число");
        Scanner custom_value = new Scanner (System.in);

        if (custom_value.hasNextInt()) {

            String custom_value_string = custom_value.nextLine();
            int size = custom_value_string.length();
            if (size == 3){

                int number = Integer.parseInt(custom_value_string);
                int a = 100;
                int nuznoi_znachenie = 0;
                if (number == 0) {
                    nuznoi_znachenie = number;
                }

                int d = 1;
                while (number > 0){
                   d = number / a;
                   nuznoi_znachenie = nuznoi_znachenie + d;
                   number = number - d * a;
                   a = a / 10;
                }

                System.out.print ("Сумма цифр: ");
                System.out.println (nuznoi_znachenie);

            } else {
                System.out.println("Извините, но это не трехзначное число. Перезапустите программу и попробуйте снова!");
            }

        } else {
            System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
        }
    }
}