package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    private List<Car> cars = new ArrayList<>();

    public CarController() {
        cars.add(new Car("KAMAZ", "P185EE150", 157));
        cars.add(new Car("KAMAZ", "P187EE150", 158));
        cars.add(new Car("FIAT", "T291XK150", 17));
        cars.add(new Car("KAMAZ", "A187TT150", 105));
        cars.add(new Car("MAZ", "T850TT190", 258));
    }

    @GetMapping (value="/cars")
    public String getAllCars (@RequestParam(required = false) Integer count, Model model) {
        //6. ѕри запросе /cars выводить весь список. ѕри запросе /cars?count=2 должен отобразитьс€ список из 2 машин,
        List<String> messages  = new ArrayList<>();
        if (count != null && count == 18) {
            messages.add("KSENIA, best regards from mam and dad");
            model.addAttribute("messages", messages);
            return "cars";
        }

        if (count == null || count <= 0 || count >=5 ) {
            count = 5;
        }
        String s;
        for (int i = 0; i < count; i++) {
            s = cars.get(i).toString();
            System.out.println(s);
            messages.add(s);
        }
        model.addAttribute("messages", messages);
        return "cars";
    }
}
