
public class Task_10 {
    public static void main(String[] args) {
        int[] dataFromTask = {15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, -52};
        System.out.print("Дан массив: ");
        int len = dataFromTask.length;
        for (int i = 0; i < (len - 1); i++) {
            System.out.print(dataFromTask[i] + ", ");
        }
        System.out.println(dataFromTask[(len - 1)]);

        for (int i = 0; i < len; i++) {
            if (dataFromTask[i] == 0) {
                for (int j = i; j < len - 1; j++) {
                    dataFromTask[j] = dataFromTask[j + 1];
                }
                dataFromTask[len - 1] = 0;
            }
        }

        System.out.print("Массив с нулями в конце: ");
        for (int i = 0; i < (len - 1); i++) {
            System.out.print(dataFromTask[i] + ", ");
        }
        System.out.println(dataFromTask[(len - 1)]);

    }
}

