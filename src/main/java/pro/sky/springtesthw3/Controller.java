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
    public int sum(@RequestParam(required = true) int num1,
                   @RequestParam(required = true) int num2) {
        return service.calculateSum(num1, num2);
    }

    @GetMapping(path = "/minus")
    public int subtration(@RequestParam(required = true) int num1,
                          @RequestParam(required = true) int num2) {
        return service.subtract(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public int multiply(@RequestParam(required = true) int num1,
                        @RequestParam(required = true) int num2) {
        return service.multiply(num1, num2);
    }

    @GetMapping(path = "devide")
    public int devide(@RequestParam(required = true) int num1,
                      @RequestParam(required = true) int num2) {
        return service.devide(num1, num2);
    }
}
