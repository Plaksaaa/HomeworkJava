package homework.okrr.task_3.builders;

import homework.okrr.task_3.Car;
import homework.okrr.task_3.CarModel;

public class CarBuilder implements Builder {

    private String name;
    private int engineCapacity;
    private CarModel carModel;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void setCarModel(CarModel carModel) {
        this.carModel = carModel;
    }

    public Car getResult(){
        return new Car(name, carModel, engineCapacity);
    }
}
