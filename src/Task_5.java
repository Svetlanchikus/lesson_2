import java.util.Scanner;
public class Task_5
{
    public static void main (String[]args){
        System.out.println("Введите, пожалуйста, три любых целых числа (можно отрицательные)");
        Scanner custom_value_1 = new Scanner(System.in);
        int number_1 = custom_value_1.nextInt();
        Scanner custom_value_2 = new Scanner(System.in);
        int number_2 = custom_value_2.nextInt();
        Scanner custom_value_3 = new Scanner(System.in);
        int number_3 = custom_value_3.nextInt();

        System.out.print("Максимальное число из них: ");

//      System.out.println(Math.max(number_1, number_2, number_3));
//или можно еще таким способом

        if (number_1 == number_2 & number_1 == number_3) {
            System.out.println(number_1);
        } else if (number_1 == number_2 && number_1 > number_3){
            System.out.println(number_1);
        } else if (number_1 == number_2 && number_1 < number_3){
            System.out.println(number_3);
        } else if (number_1 == number_3 && number_1 > number_2){
            System.out.println(number_1);
        } else if (number_1 == number_3 && number_1 < number_2){
            System.out.println(number_2);
        } else if (number_2 == number_3 && number_2 > number_1){
            System.out.println(number_2);
        } else if (number_2 == number_3 && number_2 < number_1){
            System.out.println(number_1);
        } else if (number_1 > number_2 && number_1 > number_3){
            System.out.println(number_1);
        } else if (number_2 > number_1 && number_2 > number_3){
            System.out.println(number_2);
        } else if (number_3 > number_1 && number_3 > number_2){
            System.out.println(number_3);
        }

    }
}
