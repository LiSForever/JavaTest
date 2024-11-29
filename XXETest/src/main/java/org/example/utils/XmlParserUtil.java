package org.example.utils;

//import org.apache.commons.digester3.Digester;
//import org.apache.commons.digester3.binder.DigesterLoader;
import org.dom4j.Document;
import org.dom4j.io.SAXReader;
import org.jdom2.input.SAXBuilder;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;

public class XmlParserUtil {

    // DocumentBuilder (DOM)
    public static org.w3c.dom.Document parseWithDocumentBuilder(InputStream xmlInputStream) throws Exception {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            return builder.parse(xmlInputStream);
        } catch (ParserConfigurationException | SAXException | IOException e) {
            throw new Exception("Error while parsing with DocumentBuilder", e);
        }
    }

    public static org.w3c.dom.Document parseWithDocumentBuilderDf(InputStream xmlInputStream) throws Exception {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);  // 禁用 DTD
            factory.setFeature("http://xml.org/sax/features/external-general-entities", false);  // 禁用外部实体
            factory.setFeature("http://xml.org/sax/features/external-parameter-entities", false); // 禁用外部参数实体
            DocumentBuilder builder = factory.newDocumentBuilder();
            return builder.parse(xmlInputStream);
        } catch (ParserConfigurationException | SAXException | IOException e) {
            throw new Exception("Error while parsing with DocumentBuilder", e);
        }
    }

    public static org.w3c.dom.Document parseWithDocumentBuilderDfXinclude(InputStream xmlInputStream) throws Exception {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);  // 禁用 DTD
            factory.setFeature("http://xml.org/sax/features/external-general-entities", false);  // 禁用外部实体
            factory.setFeature("http://xml.org/sax/features/external-parameter-entities", false); // 禁用外部参数实体
            factory.setXIncludeAware(false);
            DocumentBuilder builder = factory.newDocumentBuilder();
            return builder.parse(xmlInputStream);
        } catch (ParserConfigurationException | SAXException | IOException e) {
            throw new Exception("Error while parsing with DocumentBuilder", e);
        }
    }

    // SAXParser (SAX)
    public static void parseWithSAXParser(InputStream xmlInputStream, org.xml.sax.helpers.DefaultHandler handler) throws Exception {
        try {
            javax.xml.parsers.SAXParserFactory factory = javax.xml.parsers.SAXParserFactory.newInstance();
            javax.xml.parsers.SAXParser parser = factory.newSAXParser();
            parser.parse(new InputSource(xmlInputStream), handler);
        } catch (ParserConfigurationException | SAXException | IOException e) {
            throw new Exception("Error while parsing with SAXParser", e);
        }
    }
    public static void parseWithSAXParserDf(InputStream xmlInputStream, org.xml.sax.helpers.DefaultHandler handler) throws Exception {
        try {
            javax.xml.parsers.SAXParserFactory factory = javax.xml.parsers.SAXParserFactory.newInstance();
            factory.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);  // 禁用 DTD
            factory.setFeature("http://xml.org/sax/features/external-general-entities", false);  // 禁用外部实体
            factory.setFeature("http://xml.org/sax/features/external-parameter-entities", false); // 禁用外部参数实体
            javax.xml.parsers.SAXParser parser = factory.newSAXParser();
            parser.parse(new InputSource(xmlInputStream), handler);
        } catch (ParserConfigurationException | SAXException | IOException e) {
            throw new Exception("Error while parsing with SAXParser", e);
        }
    }

    // SAXBuilder (JDOM)
    public static org.jdom2.Document parseWithSAXBuilder(InputStream xmlInputStream) throws Exception {
        try {
            SAXBuilder saxBuilder = new SAXBuilder();
            return saxBuilder.build(xmlInputStream);
        } catch (Exception e) {
            throw new Exception("Error while parsing with SAXBuilder (JDOM)", e);
        }
    }

    // SAXBuilder (JDOM)
    public static org.jdom2.Document parseWithSAXBuilderDf(InputStream xmlInputStream) throws Exception {
        try {
            SAXBuilder saxBuilder = new SAXBuilder();
            saxBuilder.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);  // 禁用 DTD
            saxBuilder.setFeature("http://xml.org/sax/features/external-general-entities", false);  // 禁用外部实体
            saxBuilder.setFeature("http://xml.org/sax/features/external-parameter-entities", false); // 禁用外部参数实体

            return saxBuilder.build(xmlInputStream);
        } catch (Exception e) {
            throw new Exception("Error while parsing with SAXBuilder (JDOM)", e);
        }
    }

    // SAXBuilder (JDOM)
    public static org.jdom2.Document parseWithSAXBuilderDfXinclude(InputStream xmlInputStream) throws Exception {
        try {
            SAXBuilder saxBuilder = new SAXBuilder();
            saxBuilder.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);  // 禁用 DTD
            saxBuilder.setFeature("http://xml.org/sax/features/external-general-entities", false);  // 禁用外部实体
            saxBuilder.setFeature("http://xml.org/sax/features/external-parameter-entities", false); // 禁用外部参数实体
            saxBuilder.setExpandEntities(false); // 禁用实体展开
            return saxBuilder.build(xmlInputStream);
        } catch (Exception e) {
            throw new Exception("Error while parsing with SAXBuilder (JDOM)", e);
        }
    }

    // SAXReader (dom4j)
    public static Document parseWithSAXReader(InputStream xmlInputStream) throws Exception {
        try {
            SAXReader reader = new SAXReader();
            return reader.read(xmlInputStream);
        } catch (Exception e) {
            throw new Exception("Error while parsing with SAXReader (dom4j)", e);
        }
    }

    // SAXReader (dom4j)
    public static Document parseWithSAXReaderDf(InputStream xmlInputStream) throws Exception {
        try {
            SAXReader reader = new SAXReader();
            reader.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);  // 禁用 DTD
            reader.setFeature("http://xml.org/sax/features/external-general-entities", false);  // 禁用外部实体
            reader.setFeature("http://xml.org/sax/features/external-parameter-entities", false); // 禁用外部参数实体

            return reader.read(xmlInputStream);
        } catch (Exception e) {
            throw new Exception("Error while parsing with SAXReader (dom4j)", e);
        }
    }

//    // Digester (Apache Commons Digester)
//    public static void parseWithDigester(String ruleFile, InputStream xmlInputStream, Object bean) throws Exception {
//        try {
//            Digester digester = DigesterLoader.createDigester(new File(ruleFile));
//            digester.push(bean);
//            digester.parse(xmlInputStream);
//        } catch (IOException | SAXException e) {
//            throw new Exception("Error while parsing with Digester", e);
//        }
//    }

    // 读取文件并作为 InputStream 传递给解析器
    public static InputStream getFileInputStream(String filePath) throws IOException {
        return Files.newInputStream(new File(filePath).toPath());
    }

    // Example main method to test the parsers
    public static void main(String[] args) {
        try {
            String filePath = "D:\\l11267\\java\\program\\JavaTest\\XXETest\\src\\main\\resources\\0.xml"; // 替换为你的 XML 文件路径
            InputStream xmlInputStream = getFileInputStream(filePath);

            // Example for DocumentBuilder (DOM)
            org.w3c.dom.Document doc = parseWithDocumentBuilderDf(xmlInputStream);
            System.out.println(doc.getTextContent());
            System.out.println("DOM parsed successfully");

            // Example for SAXParser
            parseWithSAXParserDf(xmlInputStream, new org.xml.sax.helpers.DefaultHandler() {
                // Override necessary handler methods
            });
            System.out.println("SAX parsed successfully");

            // Example for SAXBuilder (JDOM)
            org.jdom2.Document jdomDoc = parseWithSAXBuilderDf(xmlInputStream);
            System.out.println(jdomDoc);
            System.out.println("JDOM parsed successfully");

            // Example for SAXReader (dom4j)
            Document dom4jDoc = parseWithSAXReaderDf(xmlInputStream);
            System.out.println(dom4jDoc);
            System.out.println("dom4j parsed successfully");

//            // Example for Digester (Commons Digester)
//            // Assuming you have a Bean object to populate
//            Object bean = new Object(); // Replace with your object
//            String ruleFile = "path_to_digester_rules.xml"; // 替换为 Digester 规则文件路径
//            parseWithDigester(ruleFile, xmlInputStream, bean);
//            System.out.println("Digester parsed successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

