package 简单工厂.计算器.edition3;

class OperationAdd extends Operation {
     @Override
     public double getResult (){
         double result = 0;
         result = numberA + numberB;
         return result;
    }
}

class OperationSub extends Operation {
    @Override
    public double getResult (){
        double result = 0;
        result = numberA - numberB;
        return result;
    }
}

class OperationMul extends Operation {
    @Override
    public double getResult (){
        double result = 0;
        result = numberA * numberB;
        return result;
    }
}

class OperationDiv extends Operation {
    @Override
    public double getResult (){
        double result = 0;
        result = numberA / numberB;
        return result;
    }
}
