package 策略模式.商场促销.edition1;

import java.util.Scanner;

public class shop {
    public static void main(String[] args) {
        double total;   //总价
        double price;   //单价
        int num;        //数量

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入商品单价：");
        price = scanner.nextDouble();
        System.out.print("请输入商品数量：");
        num = scanner.nextInt();

        total = price * num;
        System.out.println("总计价格为：" + total);
    }
}
