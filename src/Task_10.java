
public class Task_10 {
    public static void main (String [] args) {
        int[] data_from_task = {15, 10, 0, -6, -5, 3, 0,-34, 0, 32, 56, 0, 24, -52};
        System.out.print("Дан массив: ");
        int len = data_from_task.length;
        for (int i = 0; i < (len - 1); i++) {
            System.out.print(data_from_task[i] + ", ");
        }
        System.out.println(data_from_task[(len - 1)]);

        for (int i = 0; i < len; i++){
            if (data_from_task[i] == 0){
                for (int j = i; j < len-1; j++){
                    data_from_task[j] = data_from_task[j+1];
                }
                data_from_task[len-1] = 0;
            }
        }

        System.out.print("Массив с нулями в конце: ");
        for (int i = 0; i < (len - 1); i++) {
            System.out.print(data_from_task[i] + ", ");
        }
        System.out.println(data_from_task[(len - 1)]);

    }
}

