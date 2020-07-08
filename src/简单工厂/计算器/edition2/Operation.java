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
            default:
                System.out.println("输入运算符错误！");
                System.exit(1);
                }
        return result;
    }
}
