public class Task_8 {
    public static void main(String[] args) {
        int[] dataFromTask = {1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};
        System.out.print("Дан массив: ");
        int len = dataFromTask.length;

        for (int i = 0; i < (len - 1); i++) {
            System.out.print(dataFromTask[i] + ", ");
        }
        System.out.println(dataFromTask[(len - 1)]);

        int max = dataFromTask[0];
        int sumNegative = 0;
        int numberPositiveElements = 0;
        int arithmeticNegative = 0;
        int numberNegative = 0;
        for (int i = 0; i < len; i++) {
            max = dataFromTask[i];
            int maxVariable = dataFromTask[i];
            if (maxVariable > max) {
                max = maxVariable;
            }

            if (dataFromTask[i] < 0 && dataFromTask[i] % 2 == 0) {
                sumNegative = sumNegative + dataFromTask[i];
            }

            if (dataFromTask[i] > 0) {
                numberPositiveElements = numberPositiveElements + 1;
            }

            if (dataFromTask[i] < 0) {
                arithmeticNegative = arithmeticNegative + dataFromTask[i];
                numberNegative = numberNegative + 1;
            }
        }
        System.out.println("Максимальное значение");
        System.out.println(max);

        System.out.println("Сумма четных отрицательных значений");
        System.out.println(sumNegative);

        System.out.println("Количество положительных элементов");
        System.out.println(numberPositiveElements);

        System.out.println("Среднеарифметическое отрицательных элементов");
        System.out.println(arithmeticNegative / numberNegative);
    }

}