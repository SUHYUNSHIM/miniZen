package gscdn.miniZen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //view 반환
public class IndexController {
    @GetMapping("/minizen")  //로그인 화면을 index로 지정.
    public String index(){
        return "login.html";
    }
}
