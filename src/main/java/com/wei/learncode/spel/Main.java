package com.wei.learncode.spel;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class Main {

    public static void main(String[] args) {
        System.out.println(spELSample(100));
    }
    public static String spELSample(int number) {
        // 创建ExpressionParser对象，用于解析SpEL表达式
        ExpressionParser parser = new SpelExpressionParser();
        String expressionStr = "#number > 10 ? 'true' : 'false'";
        Expression expression = parser.parseExpression(expressionStr);

        // 创建EvaluationContext对象，用于设置参数值
        StandardEvaluationContext context = new StandardEvaluationContext();
        context.setVariable("number", number);

        // 求解表达式，获取结果
        return expression.getValue(context, String.class);
    }
}
