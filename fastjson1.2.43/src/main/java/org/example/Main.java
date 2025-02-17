package org.example;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.ParserConfig;
import com.sun.rowset.JdbcRowSetImpl;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws MalformedURLException {
//        java.net.URL url1 = new URL("http://123.com");
//        java.net.URL url2 = new URL("http://456.com");
//        URL[] urlarray = {url1, url2};
//        ParserConfig.getGlobalInstance().setAutoTypeSupport(true);
//        String json = JSON.toJSONString(urlarray);
//        System.out.println(json);
        Student student1 = new Student();
        Student student2 = new Student();
        Student[] students = {student1, student2};
        ParserConfig.getGlobalInstance().setAutoTypeSupport(true);
        String json = JSON.toJSONString(students);
        System.out.println(json);
    }
}