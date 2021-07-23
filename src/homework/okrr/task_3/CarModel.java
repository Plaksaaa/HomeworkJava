package homework.okrr.task_3;


import java.util.List;
import java.util.Random;

public enum CarModel {
    SPORTSCAR,
    LIMOUSINE,
    VAN;

    private static final List<CarModel> VALUES = List.of(values());
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static CarModel randomCarModel()  {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}
