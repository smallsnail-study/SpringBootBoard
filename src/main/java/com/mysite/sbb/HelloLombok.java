package com.mysite.sbb;

public class HelloLombok {
    private String hello;
    private int lombok;

    public void setHello(String hello) {
        this.hello = hello;
    }

    public void setLombok(int lombok) {
        this.lombok = lombok;
    }

    public String getHello() {
        return this.hello;
    }

    public int getLombok() {
        return this.lombok;
    }

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok();
        helloLombok.setHello("헬로");
        helloLombok.setLombok(5);

        System.out.println(helloLombok.getHello());
        System.out.println(helloLombok.getLombok());
    }
}
