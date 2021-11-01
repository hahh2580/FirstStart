package com.example.firststart.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  // 해당 클래스를, 컨트롤러로 선언!!
public class HlloController {

    @GetMapping("/") // 다음 url요청을 받음 => "/"를 보여줘 => 아래메소드를 수행!
    public String hello() {
        return "helloworld"; // helloworld.mustache페이지를 반환!
    }

    @GetMapping("/welcome")
    public String welcome() {
        return  "welcome";
    }
    @GetMapping("/greeting")
    public String greeting() {
        return "greetings";
    }

    @GetMapping("exTest/link")
    public String link() {
        return "links";
    }
}
