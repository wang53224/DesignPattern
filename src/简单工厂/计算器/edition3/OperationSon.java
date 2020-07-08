package 简单工厂.计算器.edition3;

class OperationAdd extends Operation {
     public double getResult (){
         double result = 0;
         result = numberA + numberB;
         return result;
    }
}

class OperationSub extends Operation {
    public double getResult (){
        double result = 0;
        result = numberA - numberB;
        return result;
    }
}

class OperationMul extends Operation {
    public double getResult (){
        double result = 0;
        result = numberA * numberB;
        return result;
    }
}

class OperationDiv extends Operation {
    public double getResult (){
        double result = 0;
        result = numberA / numberB;
        return result;
    }
}
