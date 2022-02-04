package gscdn.miniZen.controller;

import gscdn.miniZen.Service.ManagerService;
import gscdn.miniZen.Service.ManagerServiceImpl;
import gscdn.miniZen.model.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.ArrayList;

@Controller
public class ManagerController {
    @Autowired
    private ManagerService managerservice;

    //전체 리스트 출력, 초기 화면
    @RequestMapping(value="/minizen")
    public ModelAndView getManagerList() throws Exception{
        ModelAndView mv = new ModelAndView("/minizen/manager");
        ArrayList<Manager> mlist = managerservice.getManagerList();
        mv.addObject("mlist",mlist);

        return mv;
    }

    //검색 결과 화면 -->url을 다르게 해야 하나?
    //@RequestMapping(value="/")
    //검색 리스트를 불러오는 ajax 요청 만들기

}
