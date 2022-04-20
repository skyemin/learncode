package com.wei.learncode.spring.el;

import lombok.Data;
import org.springframework.core.annotation.Order;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.common.TemplateParserContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.util.TreeMap;

/**
 * <p></p>
 * <p>
 * <PRE>
 * <BR>    修改记录
 * <BR>-----------------------------------------------
 * <BR>    修改日期         修改人          修改内容
 * </PRE>
 *
 * @author skye
 * @version 1.0
 * @date Created in 2022年04月20日 14:48
 * @since 1.0
 */
public class TestParseEl {

    public static String parse(String elString, TreeMap<String,Object> map){
        elString=String.format("#{%s}",elString);
        //创建表达式解析器
        ExpressionParser parser = new SpelExpressionParser();
        //通过evaluationContext.setVariable可以在上下文中设定变量。
        EvaluationContext context = new StandardEvaluationContext();
        map.entrySet().forEach(entry->
                context.setVariable(entry.getKey(),entry.getValue())
        );

        //解析表达式
        Expression expression = parser.parseExpression(elString, new TemplateParserContext());
        //使用Expression.getValue()获取表达式的值，这里传入了Evaluation上下文
        String value = expression.getValue(context, String.class);
        return value;
    }

    public static void main(String[] args) {
        String elString="#order.money";
        String elString2="#user";
        String elString3="#p0";

        TreeMap<String,Object> map=new TreeMap<>();
        Order order = new Order();
        order.setId(111L);
        order.setMoney(123L);
        map.put("order",order);
        map.put("user","Hydra");

        String val = parse(elString, map);
        String val2 = parse(elString2, map);
        String val3 = parse(elString3, map);

        System.out.println(val);
        System.out.println(val2);
        System.out.println(val3);
    }

    @Data
    public static class Order{
        private Long id;
        private Long money;
    }
}
