package web.dao;

import web.models.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDAO {

    private List<Car> cars = new ArrayList<>();

    public CarDAO() {
        cars.add(new Car("KAMAZ", "P185EE150", 157));
        cars.add(new Car("KAMAZ", "P187EE150", 158));
        cars.add(new Car("FIAT", "T291XK150", 17));
        cars.add(new Car("KAMAZ", "A187TT150", 105));
        cars.add(new Car("MAZ", "T850TT190", 258));
    }
    public List<String> getCarsAsString(int number) {
        List<String> list  = new ArrayList<>();
        if (number > cars.size()) {
            number = cars.size();
        }
        for (int i = 0; i < number; i++) {
            list.add(cars.get(i).toString());
        }
        return list;
    }

}
