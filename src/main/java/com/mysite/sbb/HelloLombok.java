package com.mysite.sbb;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

// 속성에 final 추가, @RequiredArgsConstructor을 적용하면
// 해당 속성(hello, lombok)을 필요로 하는 생성자가 롬복에 의해 자동생성
@RequiredArgsConstructor // 파라미터가 없는 디폴트 생성자를 자동으로 생성
@Getter
public class HelloLombok {

    /* final 은 자료형과 변수 등을 변경할 수 없게 만드는 키워드이다.
만약 클래스 속성을 정의한 코드에 final이 없다면 생성자에 포함되지 않는다.
또한 final을 적용하면 속성값을 변경할 수 없기 때문에 @Setter는 의미가 없어지고,  Setter 메서드 또한 사용할 수 없다*/
    private final String hello;
    private final int lombok;

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok("헬로", 5);

        System.out.println(helloLombok.getHello());
        System.out.println(helloLombok.getLombok());
    }
}