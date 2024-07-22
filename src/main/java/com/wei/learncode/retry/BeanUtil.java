package com.wei.learncode.retry;

import com.alibaba.fastjson.JSON;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BeanUtil {
    public BeanUtil() {
    }

    public static Object convert(Class<?> type, String argumentString) {
        if (type == String.class) {
            return argumentString;
        } else if (type != Byte.TYPE && type != Byte.class) {
            if (type != Short.TYPE && type != Short.class) {
                if (type != Integer.TYPE && type != Integer.class) {
                    if (type != Long.TYPE && type != Long.class) {
                        if (type != Boolean.TYPE && type != Boolean.class) {
                            if (type != Float.TYPE && type != Float.class) {
                                if (type != Double.TYPE && type != Double.class) {
                                    if (type == BigInteger.class) {
                                        return new BigInteger(argumentString);
                                    } else {
                                        return type == BigDecimal.class ? new BigDecimal(argumentString) : JSON.parseObject(argumentString, type);
                                    }
                                } else {
                                    return Double.parseDouble(argumentString);
                                }
                            } else {
                                return Float.parseFloat(argumentString);
                            }
                        } else {
                            return Boolean.parseBoolean(argumentString);
                        }
                    } else {
                        return Long.parseLong(argumentString);
                    }
                } else {
                    return Integer.parseInt(argumentString);
                }
            } else {
                return Short.parseShort(argumentString);
            }
        } else {
            return Byte.parseByte(argumentString);
        }
    }
}
