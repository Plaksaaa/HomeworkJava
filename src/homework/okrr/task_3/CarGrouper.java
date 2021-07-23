package homework.okrr.task_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import homework.file.util.FileWriterUtil;
import homework.okrr.task_3.Car;
public class CarGrouper {
    public static Map<Integer, List<Car>>  GroupCar(List<Car> carList){
        Map<Integer, List<Car>> map = new TreeMap<>();
        for (Car car: carList) {
            List<Car> exitingList = map.get(car.getEngineCapacity());
            if (exitingList == null){
                exitingList = new ArrayList<>();
            }
            exitingList.add(car);

            map.put(car.getEngineCapacity(), exitingList);
        }

        map.entrySet().stream()
                .forEach(e -> System.out.println(String.format("%s : %s", e.getKey(), e.getValue())));
        /**
         запись группировки
         */
        /*map.entrySet().stream()
                .map(car -> car.getKey() + ": " + car.getValue() + "\n")
                .forEach(value -> FileWriterUtil.writeToFileEnd("data/Cars", value));*/


        return map;
    }
}
/**
 * Main
 *  List<Car> list = CarGenerator.generateCarsList(10);
 *
 *  FileWriterUtil.writeToFileEnd("data/Cars", list.stream().map(car -> "<" + car.getName() +
 *     "> : " + "<" + car.getCarModel() + "> : " + car.getEngineCapacity() + "\n").collect(Collectors.toList()).toString());
 */
/*for (Car car: list) {
        List<Car> group = map.getOrDefault(car.getEngineCapacity(), new ArrayList<>());
        group.add(car);
        map.put(car.getEngineCapacity(), group);
        }*/
