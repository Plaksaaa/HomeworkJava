package homework.okrr.task__1;

public class Task1 {

    public static int okrTask1(int x, int z, int y) {
        int result = (x + z + y) / 3;
        System.out.println(result);

        if (x > z) {
            return x + z;
        } else {
            return z;
        }
    }
}
/*System.out.println(Task1.okrTask1(ThreadLocalRandom.current().nextInt(0,100),
        ThreadLocalRandom.current().nextInt(0,100),
        ThreadLocalRandom.current().nextInt(0,100)));*/
