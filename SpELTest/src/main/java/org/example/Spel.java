package org.example;

import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class Spel {
    public String name = "何止";
    public static void main(String[] args) {
        Spel user = new Spel();
        StandardEvaluationContext context=new StandardEvaluationContext();
        context.setVariable("user",user);//通过StandardEvaluationContext注册自定义变量
        SpelExpressionParser parser = new SpelExpressionParser();//创建解析器
        Expression expression = parser.parseExpression("#user.name");//解析表达式
        System.out.println( expression.getValue(context).toString() );//取值,输出何止
    }
}
