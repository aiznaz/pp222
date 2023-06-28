package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarController {
    private CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }
    @GetMapping(value = "/cars")
    public String printCars(@RequestParam (value = "num", defaultValue = "5")
                            Integer num, Model model) {
        model.addAttribute("cars", carService.listOfCars(num));
        return "/cars";
    }
}
