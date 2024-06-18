package com.mysite.sbb;

import lombok.Getter;
@Getter
public class HelloLombok {

    private final String hello;
    private final int lombok;

    // 롬복을 사용하지 않을 경우 생성자를 직접 작성해야 한다.
    public HelloLombok(String hello, int lombok) {
        this.hello = hello;
        this.lombok = lombok;
    }

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok("헬로", 5);

        System.out.println(helloLombok.getHello());
        System.out.println(helloLombok.getLombok());
    }
}