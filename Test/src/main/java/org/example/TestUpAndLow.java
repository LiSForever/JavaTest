// 测试java中的所有unicode字符，哪些经过大小写变化后，在a-z或A-Z范围内
package org.example;

import java.util.ArrayList;
import java.util.List;


public class TestUpAndLow {
    public static void main(String[] args) {
        List<String> strlist = new ArrayList<String>();
        for (char i = 'a'; i <='z'; i++) {
            strlist.add(String.valueOf(i));
            strlist.add(String.valueOf(i).toUpperCase());
        }

        // 遍历基本多文种平面（BMP），范围是 U+0000 到 U+FFFF
        for (int codePoint = 0; codePoint <= 0xFFFF; codePoint++) {
            //if (Character.isDefined(codePoint)) {
                // 将码点转换为字符
                char[] chars = Character.toChars(codePoint);
                String character = new String(chars);
                if (strlist.contains(character)) continue;
                int index1 = strlist.indexOf(character.toUpperCase());
                if (index1!=-1) {
                    System.out.println(character+" toUpperCase "+strlist.get(index1));
                }
                int index2 = strlist.indexOf(character.toLowerCase());
                if (index2!=-1) {
                    System.out.println(character+" toLowerCase "+strlist.get(index2));
             //   }
            }
        }

        // 遍历增补平面，范围是 U+10000 到 U+10FFFF
        for (int codePoint = 0x10000; codePoint <= 0x10FFFF; codePoint++) {
            //if (Character.isDefined(codePoint)) {
                // 将码点转换为字符
                char[] chars = Character.toChars(codePoint);
                String character = new String(chars);
                if (strlist.contains(character)) continue;
                int index1 = strlist.indexOf(character.toUpperCase());
                if (index1!=-1) {
                    System.out.println(character+" toUpperCase "+strlist.get(index1));
                }
                int index2 = strlist.indexOf(character.toLowerCase());
                if (index2!=-1) {
                    System.out.println(character+" toLowerCase "+strlist.get(index2));
                }
           // }
        }
    }
}
