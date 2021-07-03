package strategy;

public class Calculator {

    public static void main(String[] args) {

        int a = 10, b = 5;
        String operator = "+";

        if (operator == "+") {
            System.out.println(a + b);
        } else if (operator == "-") {
            System.out.println(a - b);
        } else if (operator == "*") {
            System.out.println(a * b);
        }  else if (operator == "/") {
            System.out.println(a / b);
        }
    }
}
