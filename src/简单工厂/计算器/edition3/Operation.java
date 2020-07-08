package 简单工厂.计算器.edition3;

public abstract class Operation {
    double numberA;
    double numberB;

    public void setNumber(double numberA, double numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
    }

    public abstract double getResult();

}
