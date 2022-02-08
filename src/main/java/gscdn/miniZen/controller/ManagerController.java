package gscdn.miniZen.controller;

import gscdn.miniZen.Service.ManagerService;
import gscdn.miniZen.model.Manager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

//@Controller
@Slf4j
@RestController
@RequestMapping("/minizen/manager")
public class ManagerController {
    @Autowired
    private ManagerService managerservice;

    //전체 리스트
    @PostMapping(value="/list", produces = "application/json")
    public ArrayList<Manager> getManagerList() throws Exception{

        return managerservice.getManagerList();
    }

    //검색
    @GetMapping(value="/find")
    public ArrayList<Manager> getManager(String name){ //form 데이터로 받는 것으로 수정해야.
        Manager manager = new Manager();
        manager.setName(name);
        return managerservice.getManager(manager);
    }

    //추가
    @PostMapping("/register")
    public void create(@RequestBody Manager manager){
        //System.out.println("코드 값이 저장되는가? "+manager.getCode()); //null
        log.info(String.valueOf(manager));
        managerservice.createManager(manager);
        log.info(String.valueOf(manager));

    }

    //수정
    @PutMapping(value = "/update/{code}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateManager(@PathVariable("code") Integer code, @RequestBody Manager manager){  //선택한 column, code 번호의 수정창이 열림
        manager.setCode(code);
        System.out.println("코드 번호"+manager.getCode()); //현재 code가 호출되지만, column의 값으로 저장되지는 않는다. null 출력
        System.out.println("바뀐 정보1"+manager.getCompany());
        managerservice.updateManager(manager);
    }


    //삭제
    @GetMapping("/delete/{code}")
    public void deleteManager(@PathVariable("code") Integer code){ //path로 받은 code의 숫자의 것을 삭제한다.
        Manager manager = new Manager();
        manager.setCode(code);
        managerservice.deleteManager(code); //진짜 삭제하겠냐고 alert 창 띄워야.
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

    //전체 리스트 출력, 초기 화면
   /* @RequestMapping(value="/minizen") //이 주소로 접속 시 아래의 메소드를 호출한다.
    public ModelAndView getManagerList() throws Exception{
        ModelAndView mv = new ModelAndView("/minizen/manager");
        ArrayList<Manager> mlist = managerservice.getManagerList(); //서비스로부터 받아온 영업 담당자 리스트
        mv.addObject("mlist",mlist);

        return mv;
    }*/

    //rest -> vue에 전달 -> vue에서 랜더링....

}
