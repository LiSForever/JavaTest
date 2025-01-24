package org.example;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class TestDom {
    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
        // 创建DocumentBuilderFactory对象
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        // 创建DocumentBuilder对象
        DocumentBuilder db = dbf.newDocumentBuilder();
        // 解析xml
        Document document = db.parse(new File("D:\\l11267\\java\\program\\JavaTest\\XXETest\\src\\main\\resources\\error.xml"));
    }
}
