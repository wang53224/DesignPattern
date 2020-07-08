package 简单工厂.计算器.edition3;

public class OperationFactory {
    public static Operation createOperate(String operate){
        Operation ope = null;
        switch (operate){
            case "+":
                ope = new OperationAdd();
                break;
            case "-":
                ope = new OperationSub();
                break;
            case "*":
                ope = new OperationMul();
                break;
            case "/":
                ope = new OperationDiv();
                break;
            default:
                System.out.println("输入运算符错误！");
                System.exit(1);
        }
        return  ope;
    }
}
