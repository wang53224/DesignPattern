package 简单工厂.计算器.edition2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("请输入数字A：");
        Scanner scanner = new Scanner(System.in);
        double numberA = scanner.nextDouble();
        System.out.print("请输入运算符：");
        String strOperate = scanner.next();
        System.out.print("请输入数字B：");
        double numberB = scanner.nextDouble();
        double result ;

        result = Operation.getResult(numberA, numberB, strOperate);

        System.out.println("结果是：" + result);
    }
}
