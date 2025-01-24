package org.example;

import org.apache.poi.xwpf.usermodel.XWPFDocument;

import java.io.*;
import java.nio.charset.StandardCharsets;
import fr.opensagres.poi.xwpf.converter.xhtml.XHTMLConverter;
import fr.opensagres.poi.xwpf.converter.xhtml.XHTMLOptions;
import fr.opensagres.xdocreport.converter.Options;
import fr.opensagres.xdocreport.converter.docx.poi.xhtml.XWPF2XHTMLConverter;

public class TestDocxToHtml {
    public static String docx(byte[] bytes) throws IOException {
        try (ByteArrayInputStream in = new ByteArrayInputStream(bytes);
             ByteArrayOutputStream out = new ByteArrayOutputStream()) {
            XWPFDocument document = new XWPFDocument(in);
            Options options = Options.getFrom("DOCX");
            XHTMLOptions xhtmlOptions = XWPF2XHTMLConverter.getInstance().toXHTMLOptions(options);
            XHTMLConverter.getInstance().convert(document, out, xhtmlOptions);
            return new String(out.toByteArray(), StandardCharsets.UTF_8);
        }
    }
    public static byte[] readFileToByteArray(String filePath) throws IOException {
        File file = new File(filePath);

        // 获取文件长度
        long fileLength = file.length();

        // 如果文件长度过大，可能导致内存问题，可以考虑使用缓冲区处理大文件
        try (FileInputStream fis = new FileInputStream(file)) {
            // 创建一个字节数组来存储文件内容
            byte[] fileBytes = new byte[(int) fileLength];

            // 读取字节流并返回字节数组
            fis.read(fileBytes);

            return fileBytes;
        }
    }

    public static void main(String[] args) {
        try {
            byte[] fileBytes = readFileToByteArray("C:\\Users\\tlj\\Desktop\\tmp\\payload.docx"); // 替换为文件路径
            System.out.println(docx(fileBytes));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
