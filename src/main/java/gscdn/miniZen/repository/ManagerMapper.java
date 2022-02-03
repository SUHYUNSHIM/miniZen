package gscdn.miniZen.repository;

import gscdn.miniZen.model.Manager;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.List;

//DAO
@Mapper
public interface ManagerMapper {
    ArrayList<Manager> getManager(Manager manager); //이름으로 가져오기
    ArrayList<Manager> getManagerList();
    void createManager(Manager manager);
    void updateManager(Manager manager);
    void deleteManager(Manager manager);
}
