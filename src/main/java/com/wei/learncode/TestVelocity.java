package com.wei.learncode;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;
import org.apache.velocity.runtime.resource.loader.StringResourceLoader;
import org.apache.velocity.runtime.resource.util.StringResource;
import org.apache.velocity.runtime.resource.util.StringResourceRepository;

import java.io.StringWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Slf4j
public class TestVelocity {

    public static void main(String[] args) {
        VelocityEngine engine = new VelocityEngine();
        engine.setProperty(RuntimeConstants.RUNTIME_LOG_LOGSYSTEM_CLASS, "org.apache.velocity.runtime.log.Log4JLogChute");
        engine.setProperty("runtime.log.logsystem.log4j.logger", log.getName());
        engine.setProperty(Velocity.RESOURCE_LOADER, "classpath,string");
        engine.addProperty("string.resource.loader.class", StringResourceLoader.class.getName());
        engine.addProperty("string.resource.loader.repository.static", "false");
        engine.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
        engine.init();
        StringResourceRepository repo = (StringResourceRepository) engine.getApplicationAttribute(StringResourceLoader.REPOSITORY_NAME_DEFAULT);
        repo.putStringResource("test", "#foreach($element in $list)\n" +
                " This is $element.name\n" +
                "#end");
        Template template = engine.getTemplate("template/test1.vm","UTF-8");
        VelocityContext context = new VelocityContext();
        Map<String, Object> paramMap = new HashMap<>();
        Map map1 = new HashMap<>();
        map1.put("name", "zs");
        Map map2 = new HashMap<>();
        map2.put("name", "ls");
        paramMap.put("list", Arrays.asList(map1,map2));
        for (Map.Entry<String, Object> entry : paramMap.entrySet()) {
            context.put(entry.getKey(), entry.getValue());
        }
        StringWriter sw = new StringWriter();
        template.merge(context, sw);
        System.out.println(sw.toString());
    }
    @Data
    @AllArgsConstructor
    public static class Person{
        private String name;
    }
}
