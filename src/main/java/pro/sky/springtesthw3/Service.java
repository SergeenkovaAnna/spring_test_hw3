package pro.sky.springtesthw3;

@org.springframework.stereotype.Service
public class Service{
    public static int calculateSum(int num1, int num2) {
        return num1 + num2;
    }


    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int devide(int num1, int num2) {
        return num1 / num2;
    }

}
