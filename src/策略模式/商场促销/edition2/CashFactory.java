package 策略模式.商场促销.edition2;
//现金收费工厂类

import java.util.Scanner;

public class CashFactory {
    public static CashSuper createCashAccept(String type){
        CashSuper cashSuper = null;
        double condition,returnMoney,rebate;
        Scanner scanner = new Scanner(System.in);

        switch (type) {
            case "正常":
                cashSuper = new CashNormal();
                break;
            case "满减":
                System.out.print("->输入需满足的金额： ");
                condition = scanner.nextDouble();
                System.out.print("->输入可返现的金额： ");
                returnMoney = scanner.nextDouble();
                cashSuper = new CashReturn(condition, returnMoney);
                break;
            case "打折":
                System.out.print("->输入要打的折扣(小数形式)： ");
                rebate = scanner.nextDouble();
                cashSuper = new CashRebate(rebate);
                break;
            default:
                System.out.println("输入有误！");
                System.exit(0);
        }

        return cashSuper;
    }
}
