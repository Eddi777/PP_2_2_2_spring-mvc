package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

import java.util.List;

@Controller
public class CarController {

    private final CarService carService = new CarService();

    @GetMapping (value="/cars")
    public String getAllCars (@RequestParam(required = false) Integer count, Model model) {
        model.addAttribute("messages", carService.getCars(count));
        return "cars";
    }
}