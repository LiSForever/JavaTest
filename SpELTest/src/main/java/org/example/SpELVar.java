package org.example;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class SpELVar {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();
        EvaluationContext context = new StandardEvaluationContext("rui0");
        context.setVariable("variable", "#{new java.lang.ProcessBuilder(\"calc\").start()}");
        String result1 = parser.parseExpression("#variable").getValue(context, String.class);
        System.out.println(result1);

        String result2 = parser.parseExpression("#root").getValue(context, String.class);
        System.out.println(result2);
        String result3 = parser.parseExpression("#this").getValue(context, String.class);
        System.out.println(result3);
    }
}
