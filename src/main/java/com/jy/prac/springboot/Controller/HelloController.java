package com.jy.prac.springboot.Controller;

import com.jy.prac.springboot.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // JSON을 반환하는 컨트롤러로 만들어줌, 예전 @ResponseBody을 각 메서드마다 선언했던것을 한번에 해준다
public class HelloController {
    @GetMapping("/hello") //Get 요청을 받을 수 있는 API를 만들어줌, 예전 @RequestMapping(method= RequestMethod.GET)으로 사용, 이제 /hello로 요청이오면 문자열 hello를 반환한다.
    public String hello(){
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name, //{1}
                                     @RequestParam("amount") int amount) {
        return new HelloResponseDto(name,amount);
    }
}