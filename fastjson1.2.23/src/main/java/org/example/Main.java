package org.example;

import com.alibaba.fastjson.JSON;

public class Main {
    public static void main(String[] args) {
//        String serJson0 = "{\"age\":19,\"flag\":{\"flag\":\"flag{d0g3_learn_java}\"},\"name\":\"p1g3\",\"prop\":{\"name\":\"666\"},\"publictest\":\"test\",\"student\":{\"age\":10,\"name\":\"st\"}}";
//        System.out.printf("Parse had done => %s\n", JSON.parse(serJson0).getClass());
//        System.out.printf("parseObject one has done => %s\n",JSON.parseObject(serJson0).getClass());
//        System.out.printf("parseObject second has done => %s\n",JSON.parseObject(serJson0,User.class).getClass());
//
//        System.out.println("------------------------------------------");

        String serJson1 = "{\"@type\":\"org.example.User\",\"age\":19,\"flag\":{\"flag\":\"flag{d0g3_learn_java}\"},\"name\":\"p1g3\",\"prop\":{\"@type\":\"java.util.Properties\",\"name\":\"666\"},\"publictest\":\"test\",\"student\":{\"age\":10,\"name\":\"st\"}}";
//        System.out.printf("Parse had done => %s\n", JSON.parse(serJson1).getClass());
        System.out.printf("parseObject one has done => %s\n",JSON.parseObject(serJson1).getClass());
        System.out.printf("parseObject second has done => %s\n",JSON.parseObject(serJson1,User.class).getClass());
    }
}