package pro.sky.springtesthw3;

@org.springframework.stereotype.Service
public class Service{
    public static String calculateSum(int num1, int num2) {
        return num1 + " + " + num2 + " = " + (num1+num2);
    }


    public static String subtract(int num1, int num2) {
        return num1 + " - " + num2 + " = " + (num1-num2);
    }

    public static String multiply(int num1, int num2) {
        return num1 + " * " + num2 + " = " + (num1*num2);
    }

    public static String devide(int num1, int num2) {
        return num1 + " / " + num2 + " = " + (num1%num2);
    }

}
