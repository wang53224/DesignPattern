package 策略模式.商场促销.edition2;
//正常收费子类

public class CashNormal extends CashSuper {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
