import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        System.out.println("Введите, пожалуйста, код города");
        Scanner customValue = new Scanner(System.in);
        if (customValue.hasNextInt()) {
            int number = customValue.nextInt();
            float cost;
            switch (number) {

                case 905:
                    cost = 4.15f;
                    System.out.println("Моска (905) " + cost * 10);
                    break;

                case 194:
                    cost = 1.98f;
                    System.out.println("Ростов (194) " + cost * 10);
                    break;

                case 491:
                    cost = 2.69f;
                    System.out.println("Краснодар (491) " + cost * 10);
                    break;

                case 800:
                    cost = 0.5f;
                    System.out.println("Киров (800) " + cost * 10);
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
