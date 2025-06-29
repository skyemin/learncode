package com.wei.learncode.spel;


import com.sun.javafx.binding.ExpressionHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.expression.MapAccessor;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@CacheConfig(cacheNames = "CacheNames.EXPRESSION")
public class ExpressionUtil {
    private final ExpressionParser expressionParser = new SpelExpressionParser();

    // 创建上下文对象，设置自定义变量、自定义函数
    public StandardEvaluationContext createContext(String instAccountNo){
        StandardEvaluationContext context = new StandardEvaluationContext();
        context.setVariable("instAccountNo", instAccountNo);
        // 注册自定义函数
        this.registryFunction(context);
        return context;
    }

    // 注册自定义函数
    private void registryFunction(StandardEvaluationContext context) {
        try {
            context.addPropertyAccessor(new MapAccessor());
            context.registerFunction("yuanToCent", ExpressionHelper.class.getDeclaredMethod("yuanToCent", String.class));
            context.registerFunction("substringBefore", ExpressionHelper.class.getDeclaredMethod("substringBefore",String.class,String.class));
        } catch (Exception e) {
            log.info("SpEL函数注册失败:", e);
        }
    }


}