//package com.wei.learncode;
//
//import com.google.common.collect.Maps;
//import lombok.extern.slf4j.Slf4j;
//import org.apache.dubbo.rpc.model.ConsumerMethodModel;
//import org.apache.dubbo.rpc.model.ServiceMetadata;
//
//import java.util.List;
//
///**
// * @author wenzhi:tuzhihai.tzh@alibaba-inc.com
// * @date 2023/10/26
// * @desc hsf请求转发
// */
//@Slf4j
//public class HsfRequestForwardClient {
//    private static Map<String, HSFApiConsumerBean> invokeBeanMap = Maps.newConcurrentMap();
//
//
//    public static ListenableFuture<RPCResult> asyncInvoke(String serviceName, String serviceVersion,
//                                                          String serviceGroup, String methodName,
//                                                          String[] parameterType, Object[] parameterValue,
//                                                          int timeout, Runnable beforeAction,Runnable afterAction) throws Throwable {
//        if (log.isDebugEnabled()) {
//            log.debug("[{}]Thread start to async invoke hsf service...", Thread.currentThread().getName());
//        }
//        // 1、创建异步调用consumer
//        HSFApiConsumerBean consumerBean = getConsumerBean(serviceName, serviceVersion, serviceGroup);
//        // 2、设置超时时间
//        if (timeout > 0) {
//            RequestCtxUtil.setRequestTimeout(timeout);
//        }
//        // 3、执行调用前动作
//        if (beforeAction != null) {
//            beforeAction.run();
//        }
//        // 4、开始异步调用
//        Invocation invocation = buildHsfInvocation(consumerBean, methodName, parameterType, parameterValue);
//        ListenableFuture<RPCResult> result = consumerBean.getMetadata().getInvocationHandler().invoke(invocation);
//        // 5、执行调用后动作
//        if (afterAction != null) {
//            afterAction.run();
//        }
//        return result;
//    }
//
//    private static Invocation buildHsfInvocation(HSFApiConsumerBean consumer,String methodName,
//                                                 String[] parameterType, Object[] parameterValue) {
//        // 1、寻找泛化调用的接口method
//        ServiceMetadata serviceMeta = consumer.getMetadata();
//        List<ConsumerMethodModel> allMethods = serviceMeta.getConsumerServiceModel().getAllMethods();
//        ConsumerMethodModel cmm = allMethods.stream()
//                .filter(csm -> csm.getMethodName().equals(HSFConstants.$INVOKE))
//                .findAny()
//                .orElseThrow(() -> new IllegalArgumentException(String.format("cannot find HsfRequestForwardClient $invoke")));
//
//        // 2、构造泛化调用的hsf接口
//        Object[] hsfParameterValue = new Object[] {
//                methodName,
//                parameterType,
//                parameterValue};
//        return InvocationUtil.buildInvocation(cmm, hsfParameterValue);
//    }
//
//    /**
//     * 获取ConsumerBean
//     * @param serviceName
//     * @param serviceVersion
//     * @param serviceGroup
//     * @return
//     */
//    private static HSFApiConsumerBean getConsumerBean(String serviceName, String serviceVersion, String serviceGroup) {
//        return invokeBeanMap.computeIfAbsent(buildUniqueKey(serviceGroup,serviceName,serviceVersion),idx -> {
//            try {
//                HSFApiConsumerBean hsfApiConsumerBean = new HSFApiConsumerBean();
//                hsfApiConsumerBean.setInterfaceName(serviceName);
//                hsfApiConsumerBean.setVersion(serviceVersion);
//                hsfApiConsumerBean.setGroup(serviceGroup);
//                hsfApiConsumerBean.setGeneric("true");
//                hsfApiConsumerBean.setSingleton(false);
//                hsfApiConsumerBean.init(true);
//                return hsfApiConsumerBean;
//            } catch (Exception ex) {
//                log.error("fail to init consumer bean of : serviceName:{},serviceVersion:{},serviceGroup:{},e", serviceName, serviceVersion,serviceGroup, ex);
//                throw new RuntimeException(ex.getMessage());
//            }
//        });
//    }
//
//    private static String buildUniqueKey(String serviceGroup, String serviceName, String serviceVersion) {
//        StringBuilder uniqueKey = new StringBuilder();
//        uniqueKey.append(serviceGroup+"#");
//        uniqueKey.append(serviceName+"#");
//        uniqueKey.append(serviceVersion);
//        return uniqueKey.toString();
//    }
//
//}
