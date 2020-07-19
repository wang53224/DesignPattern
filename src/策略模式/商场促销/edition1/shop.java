package 策略模式.商场促销.edition1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class shop {
    public static void main(String[] args) {
        double total;   //总价
        double price;   //单价
        int num;        //数量

        Scanner scanner = new Scanner(System.in);
        boolean isTrue = true;

        while (isTrue) {
            try {
                System.out.print("请输入商品单价：");
                price = scanner.nextDouble();
                System.out.print("请输入商品数量：");
                num = scanner.nextInt();
                total = price * num;
                System.out.println("总计价格为：" + total);
                isTrue = false;
            } catch (InputMismatchException e) {
                System.out.println("输入的数字有误，请重新输入！");
                scanner.nextLine();// 清空输入的数字
            }
        }


    }
}
