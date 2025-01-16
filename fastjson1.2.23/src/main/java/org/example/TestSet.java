package org.example;

public class TestSet {
    private int a;
    private int b;
    private int c;
    public TestSet() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }
    public void setAbc(int a) {
        System.out.println("setAbc:"+a);
        this.a = 1;
        this.b = 1;
        this.c = 1;
    }


}
