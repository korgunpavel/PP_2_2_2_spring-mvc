package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImp;

@Controller
public class CarController {

    private final CarServiceImp carServiceImp;

    @Autowired
    public CarController(CarServiceImp carServiceImp) {
        this.carServiceImp = carServiceImp;
    }

    @GetMapping("/cars")
    public String car(@RequestParam(value = "count", required = false) Integer count, ModelMap model) {
        if (count == null) {
            model.addAttribute("cars", carServiceImp.getCars(5));
        } else {
            model.addAttribute("cars", carServiceImp.getCars(count));
        }
        return "cars";
    }

}
