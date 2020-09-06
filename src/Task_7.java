import java.util.Scanner;
public class Task_7
{
    public static void main (String[]args){
        System.out.println("Введите, пожалуйста, код города");
        Scanner custom_value = new Scanner(System.in);
        if (custom_value.hasNextInt()) {
            int number = custom_value.nextInt();
            switch (number) {

                case 905:
                    System.out.println("Моска (905) 41,5");
                    break;

                case 194:
                    System.out.println("Ростов (194) 19,8");
                    break;

                case 491:
                    System.out.println("Краснодар (491) 26,9");
                    break;

                case 800:
                    System.out.println("Киров (800) 50,0");
                    break;

                default:
                    System.out.println("Извините, такого кода города программа не знает");
                    break;
            }

        } else {
            System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
        }
    }
}
