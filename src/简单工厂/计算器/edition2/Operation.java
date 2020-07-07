package 简单工厂.计算器.edition2;

public class Operation {

    public Operation(){

    }

    public static double getResult(double numberA, double numberB, String operation) {
        double result = 0.0d;

        switch (operation){
            case "+":
                result = numberA + numberB;
                break;
            case "-":
                result = numberA - numberB;
                break;
            case "*":
                result = numberA * numberB;
                break;
            case "/":
                    result = numberA / numberB;
                    break;
                }
        return result;
    }
}
