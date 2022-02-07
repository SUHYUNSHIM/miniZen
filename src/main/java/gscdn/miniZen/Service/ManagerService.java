package gscdn.miniZen.Service;

import gscdn.miniZen.model.Manager;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


public interface ManagerService {
    ArrayList<Manager> getManager(Manager manager); //이름으로 가져오기
    ArrayList<Manager> getManagerList() throws Exception; //전체리스트
    void createManager(Manager manager); //추가
    void updateManager(Manager manager);  //수정
    void deleteManager(Integer code);  //삭제

    //////++컬럼명을 누르면 해당 컬럼에 따라 정렬되어야 한다. 정렬메서드 구상해야./////

}
