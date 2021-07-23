package homework.okrr.task_3.builders;

import homework.okrr.task_3.CarModel;

import java.util.concurrent.ThreadLocalRandom;

public class Director {
    public void constructCar(Builder builder) {
        builder.setCarModel(CarModel.randomCarModel());
        builder.setEngineCapacity(ThreadLocalRandom.current().nextInt(1,4));
        builder.setName(CarModel.randomCarModel().toString());
    }


}
