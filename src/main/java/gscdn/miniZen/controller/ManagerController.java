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
    @GetMapping(value="/find/{name}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<Manager> getManager(@PathVariable("name") String name){
        Manager manager = new Manager();
        manager.setName(name);
        return managerservice.getManager(manager);
    }

    //추가
    @PostMapping("/register")
    public void create(@RequestBody Manager manager){

        managerservice.createManager(manager); //추가
        int codeNum = managerservice.registerCode(); //최근 등록 코드번호 반환
        System.out.println("code값 넘어가는 가"+codeNum);
        //managerservice.autoCodeUpdate(codeNum); //코드 번호 auto로 된 것으로 update
        log.info(String.valueOf(manager)); //code에서는 null이 찍힘
    }

    //수정
    @PutMapping(value = "/update/{code}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateManager(@PathVariable("code") Integer code, @RequestBody Manager manager){  //선택한 column, code 번호의 수정창이 열림
        manager.setCode(code);
        System.out.println("코드 번호"+manager.getCode());
        managerservice.updateManager(manager); //기존값을 다 manager로 가져왔다는 전제로, code번호 제외 모든 칼럼을 넘겨주어야 한다.
    }


    //삭제
    @GetMapping("/delete/{code}")
    public void deleteManager(@PathVariable("code") Integer code){ //path로 받은 code의 숫자의 것을 삭제한다.
        Manager manager = new Manager();
        manager.setCode(code);
        System.out.println("삭제할 코드 번호"+manager.getCode());
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

    //rest -> vue에 전달 -> vue에서 랜더링....

}
