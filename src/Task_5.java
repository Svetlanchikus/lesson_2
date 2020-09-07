import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        System.out.println("Введите, пожалуйста, три любых целых числа (можно отрицательные)");
        Scanner customValue1 = new Scanner(System.in);
        int max = customValue1.nextInt();

        for (int i = 1; i < 3; i++) {
            Scanner customValue2 = new Scanner(System.in);
            int number = customValue2.nextInt();
            if (number > max) {
                max = number;
            }
        }

        System.out.print("Максимальное число из них: " + max);






    }
}
