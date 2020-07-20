package 策略模式.商场促销.edition2;
//返利收费子类
//初始化时输入返利条件和返利值
//如满300返利100,则condition=300,returnMoney=100

public class CashReturn extends CashSuper {
    private double condition = 0.0,returnMoney = 0.0;
    CashReturn(){}
    CashReturn(double condition, double returnMoney){
        this.condition = condition;
        this.returnMoney = returnMoney;
    }

    @Override
    double acceptCash(double money) {
        double result = money;
        if (money >= condition) {
            result = money - returnMoney;
        }
        return result;
    }
}
