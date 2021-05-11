package ro.fasttrackit.homework12.extramile;

import java.util.*;

public class CarShop {
    private final List<Cars> cars = new ArrayList<>();

    public CarShop(Collection<Cars> cars) {
        if (cars != null) {
            this.cars.addAll(cars);
        }
    }

    public Map<CarList, Integer> carToNumber() {
        Map<CarList, Integer> result = new HashMap<>();
        for (Cars car : cars) {
            Integer count = result.get(car.getName());
            if (count == null) {
                count = 0;
            }
            count++;
            result.put(car.getName(), count);
        }
        return result;
    }

    public Map<CarList, Integer> carToKm() {
        Map<CarList, Integer> result = new HashMap<>();
        for (Cars car : cars) {
            Integer km = result.get(car.getName());
            if (km == null) {
                km = 0;
            }
            km += car.getKm();
            result.put(car.getName(), km);
        }
        return result;
    }

    public Map<KmRange, List<Cars>> rangeToCar(int rangeValues) {
        Map<KmRange, List<Cars>> result = new HashMap<>();
        for (Cars car : cars) {
            KmRange carRanges = calculateRange(car, rangeValues);
            List<Cars> carsInRange = result.get(carRanges);
            if (carsInRange == null) {
                carsInRange = new ArrayList<>();
                result.put(carRanges, carsInRange);
            }
            carsInRange.add(car);
        }
        return result;
    }

    private KmRange calculateRange(Cars car, Integer rangeValues) {
        int km = car.getKm();
        KmRange result = new KmRange((km / rangeValues * rangeValues),
                (km / rangeValues + 1) * rangeValues);
        return result;
    }

}
