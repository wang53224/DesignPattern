package 策略模式.商场促销.edition2;
//打折收费,初始化时输入折扣率,如八折则输入0.8

public class CashRebate extends CashSuper {
    private double moneyRebate = 1d;
    CashRebate(){}
    CashRebate(double moneyRebate){
        this.moneyRebate = moneyRebate;
    }

    @Override
    double acceptCash(double money) {
        return money * moneyRebate;
    }
}
