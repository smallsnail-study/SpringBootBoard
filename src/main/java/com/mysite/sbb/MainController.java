package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // 스프링 부트의 컨트롤러가 된다.
public class MainController {
    @GetMapping("/sbb") // 요청된 URL(/sbb)과의 매핑 담당
    public void index() {
        System.out.println("index"); // 콘솔 로그로 index 메서드 호출여부 확인 가능(결과값을 리턴하지 않아 500에러가 발생한다.)
    }
}
