package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // 스프링 부트의 컨트롤러가 된다.
public class MainController {
    @GetMapping("/sbb") // 요청된 URL(/sbb)과의 매핑 담당
    @ResponseBody // URL요청에 대한 응답으로 메서드의 타입을 리턴
    public String index() { // 응답을 받기 위해 void -> String으로 변경
        return "index";
    }
}
