package com.wei.learncode.spring.scope;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.ValueFilter;
import com.timevale.esign.paas.tech.bean.bean.PosBean;
import com.timevale.esign.paas.tech.bean.request.OrgSignParam;
import com.timevale.esign.paas.tech.bean.request.SignFilePdfParam;
import com.timevale.esign.paas.tech.enums.SignType;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		//AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
//		DemoPrototypeService s1 = context.getBean(DemoPrototypeService.class);
//		DemoPrototypeService s2 = context.getBean(DemoPrototypeService.class);
//		System.out.println("prototype:"+(s1==s2));
//
//		DemoSingletonService s3 = context.getBean(DemoSingletonService.class);
//		DemoSingletonService s4 = context.getBean(DemoSingletonService.class);
//		System.out.println("singleton:"+(s3==s4));
		
		//context.close();

//		User user = new User();
//		User.Son son = new User.Son();
//		son.setName("123");
//		user.setSon(son);
//		ValueFilter filter = (objField, fieldName, value) -> {
//			if ("name".equals(fieldName)) {
//				return null;
//			}
//			return value; // 返回原始值
//		};
//		String jsonString = JSON.toJSONString(user,filter);
//		System.out.println(jsonString);
		OrgSignParam eSignParam = new OrgSignParam();
		eSignParam.setAccountId("1");
		eSignParam.setSealData("1");
		eSignParam.setSignType(SignType.Key);

		SignFilePdfParam signFilePdfParam = new SignFilePdfParam();
		signFilePdfParam.setFileName("1");
		signFilePdfParam.setStreamFile("shjsadashads".getBytes());
		eSignParam.setFileBean(signFilePdfParam);

		List<PosBean> posBeanList = new ArrayList<>();
		PosBean posBean = new PosBean();
		posBean.setKeyWord("222");
		posBeanList.add(posBean);
		eSignParam.setPosBeans(posBeanList);
		ValueFilter filter = (objField, fieldName, value) -> {
			if ("stream".equals(fieldName)) {
				return null;
			}
			if ("streamFile".equals(fieldName)) {
				return null;
			}
			if ("bytes".equals(fieldName)) {
				return null;
			}
			return value; // 返回原始值
		};
		String jsonString = JSON.toJSONString(eSignParam,filter);
		System.out.println(jsonString);

	}

}
