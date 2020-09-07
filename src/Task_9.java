
public class Task_9 {
    public static void main(String[] args) {
        int[] dataFromTask = {15, 10, 51, -6, -5, 3, -10, -34, 0, 32, 56, -12, 24, 52};
        System.out.print("Дан массив: ");
        int len = dataFromTask.length;
        for (int i = 0; i < (len - 1); i++) {
            System.out.print(dataFromTask[i] + ", ");
        }
        System.out.println(dataFromTask[(len - 1)]);

        System.out.println("Массив в обратном порядке:");
        for (int i = (len - 1); i > 0; i--) {
            System.out.print(dataFromTask[i] + " ");
        }
    }
}

