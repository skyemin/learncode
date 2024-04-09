package com.wei.learncode;

import com.alibaba.fastjson.JSONObject;
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
        String html = "";
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

        String json = "{\"passengers\":[{\"firstName\":\"YiTong\",\"lastName\":\"Li\",\"ticketNum\":\"000-12345678\"},{\"firstName\":\"Qiu\",\"lastName\":\"Ling\",\"ticketNum\":\"111-87654321\"}],\"orderId\":\"123456789098765\",\"flightDetails\":[{\"airline\":\"CA\",\"arrAirport\":\"Don Mueang Inernational Airport\",\"arrAirportTerm\":\"T1\",\"arrCity\":\"Bangkok\",\"arrTime\":\"Wednesday, Apr 3 2024 · 18:00\",\"cabinClass\":\"Economy (Q)\",\"depAirport\":\"Ninoy Aquino International Airport\",\"depAirportTerm\":\"T2\",\"depCity\":\"Manila\",\"depTime\":\"Wednesday, Apr 3 2024 · 12:00\",\"flightNo\":\"1234\",\"segmentId\":\"1\"},{\"airline\":\"CA\",\"arrAirport\":\"BaiYun International Airport\",\"arrAirportTerm\":\"T2\",\"arrCity\":\"Beijing\",\"arrTime\":\"Wednesday, Apr 4 2024 · 02:00\",\"cabinClass\":\"Economy (Q)\",\"depAirport\":\"Don Mueang Inernational Airport\",\"depAirportTerm\":\"T1\",\"depCity\":\"Bangkok\",\"depTime\":\"Wednesday, Apr 3 2024 · 19:00\",\"flightNo\":\"3456\",\"segmentId\":\"2\"}]}";
        //String json = "{\"orderId\":\"123456789098765\",\"flightDetails\":[{\"airline\":\"CA\",\"arrAirport\":\"Don Mueang Inernational Airport\",\"arrAirportTerm\":\"T1\",\"arrCity\":\"Bangkok\",\"arrTime\":\"Wednesday, Apr 3 2024 · 18:00\",\"cabinClass\":\"Economy (Q)\",\"depAirport\":\"Ninoy Aquino International Airport\",\"depAirportTerm\":\"T2\",\"depCity\":\"Manila\",\"depTime\":\"Wednesday, Apr 3 2024 · 12:00\",\"flightNo\":\"1234\",\"segmentId\":\"1\"},{\"airline\":\"CA\",\"arrAirport\":\"BaiYun International Airport\",\"arrAirportTerm\":\"T2\",\"arrCity\":\"Beijing\",\"arrTime\":\"Wednesday, Apr 4 2024 · 02:00\",\"cabinClass\":\"Economy (Q)\",\"depAirport\":\"Don Mueang Inernational Airport\",\"depAirportTerm\":\"T1\",\"depCity\":\"Bangkok\",\"depTime\":\"Wednesday, Apr 3 2024 · 19:00\",\"flightNo\":\"3456\",\"segmentId\":\"2\"}]}";
        Map<String, Object> paramMap = JSONObject.parseObject(json);
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
