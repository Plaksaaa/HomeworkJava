package homework.okrr.task_3.builders;

import homework.okrr.task_3.CarModel;

public interface Builder {
    void setName(String carNumber);
    void setCarModel(CarModel carModel);
    void setEngineCapacity(int value);
}
