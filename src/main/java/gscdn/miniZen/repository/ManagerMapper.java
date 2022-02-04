package gscdn.miniZen.repository;

import gscdn.miniZen.model.Manager;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.List;

//DAO. mapperxml과 연결.
@Mapper
public interface ManagerMapper {
    ArrayList<Manager> getManager(Manager manager); //이름으로 가져오기
    ArrayList<Manager> getManagerList(); //전체 리스트
    void createManager(Manager manager); //추가
    void updateManager(Manager manager); //수정
    void deleteManager(Manager manager); //삭제
}
