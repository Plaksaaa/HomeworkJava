package homework.okrr.task_2;

public class Task2 {

    public static void task2(int[] array) {
        int max = array[0];
        int min = array[0];
        int indexMax = 0;
        int indexMin = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                indexMax = i;
                System.out.println("Max i : " + indexMax);
                max = array[i];
                System.out.println("Max element in Array: " + max);
            }
            if (array[i] < min) {
                indexMin = i;
                System.out.println("Min i : " + indexMin);
                min = array[i];
                System.out.println("Min element in Array: " + min);
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (i == indexMax){
                array[i] = max * min;
            }
            System.out.println(array[i]);
        }
    }
}
    /*int[] array = {4, 2, 10, 4, 5};
        Task2.task2(array);*/