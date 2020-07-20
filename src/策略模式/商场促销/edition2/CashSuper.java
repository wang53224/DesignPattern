package 策略模式.商场促销.edition2;
//现金收费抽象类

abstract class CashSuper {
    abstract double acceptCash(double money);
    //收取现金方法,参数为原价,返回为当前价
}
