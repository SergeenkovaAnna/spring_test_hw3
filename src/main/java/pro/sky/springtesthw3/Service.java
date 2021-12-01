package pro.sky.springtesthw3;

import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Service
public class Service{
    public static String calculateSum(@RequestParam(required = true) int num1,
                                      @RequestParam(required = true) int num2) {
        return num1 + " + " + num2 + " = " + (num1+num2);
    }


    public static String subtract(@RequestParam(required = true) int num1,
                                  @RequestParam(required = true) int num2) {
        return num1 + " - " + num2 + " = " + (num1-num2);
    }

    public static String multiply(@RequestParam(required = true) int num1,
                                  @RequestParam(required = true) int num2) {
        return num1 + " * " + num2 + " = " + (num1*num2);
    }

    public static String devide(@RequestParam(required = true) int num1,
                                @RequestParam(required = true) int num2) {
        return num1 + " / " + num2 + " = " + (num1%num2);
    }

}
