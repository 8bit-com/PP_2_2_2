package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.Optional;

@Controller
public class CarController {
    @GetMapping("/cars")
    public String printCar(@RequestParam(defaultValue = "5") int count, Model model) {
        CarService service = new CarServiceImpl();
        model.addAttribute("count", service.getCars(count));
        return "cars";
    }
}
