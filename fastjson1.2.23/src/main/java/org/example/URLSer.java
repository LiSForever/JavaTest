package org.example;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.ParserConfig;

import java.net.MalformedURLException;
import java.net.URL;

public class URLSer {
    public static void main(String[] args) throws MalformedURLException {
        java.net.URL url1 = new URL("http://123.com");
        java.net.URL url2 = new URL("http://456.com");
        URL[] urlarray = {url1, url2};
        String json = JSON.toJSONString(urlarray);
        System.out.println(json);
    }
}
