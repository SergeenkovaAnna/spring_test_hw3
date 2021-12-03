package pro.sky.springtesthw3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/calculator")
public class Controller {
    private final Service service;

    public Controller(Service service) {
        this.service = service;

    }

    @GetMapping
    public String showHello() {
        return "Добро пожаловать в калькулятор!";
    }

    @GetMapping(path = "/plus")
    public String sum(@RequestParam(required = true) int num1,
                      @RequestParam(required = true) int num2) {
        Service service;
        return Service.calculateSum(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String subtration(@RequestParam(required = true) int num1,
                             @RequestParam(required = true) int num2) {
        Service service;
        return Service.subtract(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam(required = true) int num1,
                           @RequestParam(required = true) int num2) {
        Service service;
        return Service.multiply(num1, num2);
    }

    @GetMapping(path = "devide")
    public String devide(@RequestParam(required = true) int num1,
                         @RequestParam(required = true) int num2) {
        Service service;
        return Service.devide(num1, num2);
    }
}
