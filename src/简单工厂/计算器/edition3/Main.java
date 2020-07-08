package 简单工厂.计算器.edition3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入数字A：");
        double numberA = scanner.nextDouble();

        System.out.print("请输入运算符：");
        String operate = scanner.next();

        System.out.print("请输入数字B：");
        double numberB = scanner.nextDouble();

        Operation ope = OperationFactory.createOperate(operate);
        ope.setNumber(numberA,numberB);
        double result = ope.getResult();
        System.out.println("结果为：" + result);
    }

}
