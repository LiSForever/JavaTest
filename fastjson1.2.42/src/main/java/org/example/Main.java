package org.example;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        Class cla = Array.newInstance(com.sun.rowset.JdbcRowSetImpl.class,0).getClass();
        System.out.println(cla);
    }
}