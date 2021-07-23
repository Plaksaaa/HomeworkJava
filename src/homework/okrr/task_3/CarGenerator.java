package homework.okrr.task_3;

import homework.okrr.task_3.builders.CarBuilder;
import homework.okrr.task_3.builders.Director;

import java.util.ArrayList;
import java.util.List;

public class CarGenerator {
    public static List<Car> generateCarsList(int carsCount) {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();

        List<Car> carList = new ArrayList<>(carsCount);
        for (int i = 0; i < carsCount; i++) {
            director.constructCar(carBuilder);
            Car car = carBuilder.getResult();
            carList.add(car);
        }
        return carList;
    }
}
