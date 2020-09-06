
public class Task_9 {
    public static void main (String [] args) {
        int[] data_from_task = {15, 10, 51, -6, -5, 3, -10, -34, 0, 32, 56, -12, 24, 52};
        System.out.print("Дан массив: ");
        int len = data_from_task.length;
        for (int i = 0; i < (len - 1); i++) {
            System.out.print(data_from_task[i] + ", ");
        }
        System.out.println(data_from_task[(len - 1)]);


        int number_min = 0;
        int new_array;
        for (int j = 0; j < len; j++){
            int min = data_from_task[j];
            for (int i = j; i < len; i++) {
                if (data_from_task[i] <= min) {
                    min = data_from_task[i];
                    number_min = i;
                    System.out.println(i);
                }
            }
            new_array = data_from_task[j];
            data_from_task[j] = min;
            data_from_task[number_min] = new_array;
        }

        System.out.println("Элементы в обратном порядке:");
        for (int i = 0; i < (len - 1); i++) {
            System.out.print(data_from_task[i] + ", ");
        }
        System.out.println(data_from_task[(len - 1)]);

    }
}

