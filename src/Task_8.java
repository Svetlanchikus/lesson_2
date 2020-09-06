public class Task_8 {
    public static void main (String [] args) {
        int[] data_from_task = {1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};
        System.out.print("Дан массив: ");
        int len = data_from_task.length;

        for (int i = 0; i < (len - 1); i++){
            System.out.print(data_from_task[i] + ", ");
            }
        System.out.println(data_from_task[(len - 1)]);


        int max = data_from_task[0];
        for (int i = 1; i < len; i++){
            int max_variable = data_from_task[i];
            if (max_variable > max){
                max = max_variable;
            }
        }
        System.out.println("Максимальное значение");
        System.out.println(max);

        int sum_of_even_negative = 0;
        for (int i = 0; i < len; i++){
            if (data_from_task[i] < 0 && data_from_task[i] % 2 == 0){
                sum_of_even_negative = sum_of_even_negative + data_from_task[i];
            }
        }
        System.out.println("Сумма четных отрицательных значений");
        System.out.println(sum_of_even_negative);

        int number_of_positive_elements = 0;
        for (int i = 0; i < len; i++){
            if (data_from_task[i] > 0){
                number_of_positive_elements = number_of_positive_elements + 1;
            }
        }
        System.out.println("Количество положительных элементов");
        System.out.println(number_of_positive_elements);

        int arithmetic_mean_of_negative = 0;
        int number_negative = 0;
        for (int i = 0; i < len; i++){
            if (data_from_task[i] < 0){
                arithmetic_mean_of_negative = arithmetic_mean_of_negative + data_from_task[i];
                number_negative = number_negative + 1;
            }
        }
        System.out.println("Среднеарифметическое отрицательных элементов");
        System.out.println(arithmetic_mean_of_negative / number_negative);
    }

}