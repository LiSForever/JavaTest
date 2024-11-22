package org.example;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();//创建解析器
        Expression exp = parser.parseExpression("'Hello World'.concat('!')");//解析表达式
        System.out.println( exp.getValue() );//取值，Hello World！
    }
}