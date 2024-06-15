package com.mysite.sbb;

// 스프링 부트의 import문 : 다른 클래스, 패키지, 라이브러리 등을 사용할 때 관련 요소를 가져오는 역할
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // HelloController 클래스가 컨트롤러의 기능을 수행한다는 것을 의미
public class HelloController {
    @GetMapping("/hello") // 클라이언트의 요청으로 hello 메서드가 실행됨을 알려준다.
    @ResponseBody // hello 메서드의 출력값 그대로 리턴할 것임을 알려준다.
    public String hello() {
        return "Hello World";
    }
}