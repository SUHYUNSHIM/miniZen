package gscdn.miniZen.controller;

import gscdn.miniZen.Service.ManagerService;
import gscdn.miniZen.Service.ManagerServiceImpl;
import gscdn.miniZen.model.Manager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.ArrayList;

//@Controller
@Slf4j
@RestController
@RequestMapping("/minizen/manager")
public class ManagerController {
    @Autowired
    private ManagerService managerservice;

    //전체 리스트 출력, 초기 화면
   /* @RequestMapping(value="/minizen") //이 주소로 접속 시 아래의 메소드를 호출한다.
    public ModelAndView getManagerList() throws Exception{
        ModelAndView mv = new ModelAndView("/minizen/manager");
        ArrayList<Manager> mlist = managerservice.getManagerList(); //서비스로부터 받아온 영업 담당자 리스트
        mv.addObject("mlist",mlist);

        return mv;
    }*/

    @PostMapping(value="/list",produces = "application/json")
    public ArrayList<Manager> getManagerList() throws Exception{
        //model.addAttribute("managerList",managerList);
        return managerservice.getManagerList();
    }

    //객체 저장 예시.
    @RequestMapping("/test")
    public Manager testMG(){
        Manager manager = new Manager();
        manager.setName("김둘리");
        manager.setPhone("010-7878-2121");
        manager.setCompany("GS칼텍스");
        manager.setEmail("kdl@gmail.com");
        return manager;
    }
    /*
    @RequestMapping("/findManager")
    public Manager findMG(Manager manager){
        //ArrayList<Manager> getManager(Manager manager);
        //ArrayList<Manager>
    }

     */

    //검색 결과 화면 -->url을 다르게 해야 하나?
    //@RequestMapping(value="/")
    //검색 리스트를 불러오는 ajax 요청 만들기

}
