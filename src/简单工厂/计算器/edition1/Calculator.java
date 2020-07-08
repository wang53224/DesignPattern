package 简单工厂.计算器.edition1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.print("请输入数字A：");
        Scanner scanner = new Scanner(System.in);
        double numberA = scanner.nextDouble();
        System.out.print("请输入运算符：");
        String strOperate = scanner.next();
        System.out.print("请输入数字B：");
        double numberB = scanner.nextDouble();
        double result = 0.0d;

        switch (strOperate){
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
                try {           //这里似乎没有必要
                    result = numberA / numberB;
                }catch (ArithmeticException e){
                    e.printStackTrace();
                    System.out.println("除数不能为零！");
                }
                break;
            default:
                System.out.println("输入运算符错误！");
                System.exit(1);

        }
        System.out.println("结果是：" + result);
    }
}
