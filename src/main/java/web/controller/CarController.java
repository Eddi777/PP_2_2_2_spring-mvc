package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDAOImpl;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    CarDAOImpl carDAO = new CarDAOImpl();

    @GetMapping (value="/cars")
    public String getAllCars (@RequestParam(required = false) Integer count, Model model) {
        if (count == null){
            count=Integer.MAX_VALUE;
        }
        List<String> messages = carDAO.getCarsAsString(count);
        model.addAttribute("messages", messages);
        return "cars";
    }
}