package com.daxing.design.model22;

import java.util.HashMap;

public abstract class Expression {
    protected AddExpression left;
    protected AddExpression right;

    public Expression(Expression left, Expression right) {
    }

    public Expression() {

    }

    //解析公式和数值,其中var中的key值是是公式中的参数，value值是具体的数字
    public abstract int interpreter(HashMap<String,Integer> var);
}
