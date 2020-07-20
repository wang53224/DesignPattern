package 策略模式.商场促销.edition2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class shop {
    public static void main(String[] args) {
        double total;   //单品总价
        double price;   //单价
        int num;        //数量
        double totalPrice = 0;  //一共总价
        String isTrue,model;

        System.out.print("输入要结算的商品总数：");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        for (int i = 0; i < input; i++) {
            while (true) {
                try {
                    System.out.printf("请输入第%d件商品单价：",i+1);
                    price = scanner.nextDouble();
                    System.out.printf("请输入第%d件商品数量：",i+1);
                    num = scanner.nextInt();
                    System.out.print("是否有优惠？  (是/否) ");
                    scanner.nextLine();
                    isTrue = scanner.nextLine();
                    if (isTrue.equals("是")){
                        System.out.print("输入优惠模式：   (正常/满减/打折) ");
                        model = scanner.nextLine();
                        CashSuper cashSuper = CashFactory.createCashAccept(model);
                        total = cashSuper.acceptCash(price * num);
                    }
                    else {
                        total = price * num;
                    }
                    totalPrice += total;
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("输入的数字有误，请重新输入！");
                    scanner.nextLine();// 清空输入的数字
                }
            }
            System.out.println("<--->当前总计价格为：" + totalPrice);
        }
    }
}
