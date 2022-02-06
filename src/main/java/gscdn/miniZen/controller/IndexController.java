package gscdn.miniZen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //view 반환
public class IndexController {
    @RequestMapping("/")  //로그인 화면을 index로 지정.
    public String index(){
        return "index";
    }
}
