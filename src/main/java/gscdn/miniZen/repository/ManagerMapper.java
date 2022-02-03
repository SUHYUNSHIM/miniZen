package gscdn.miniZen.repository;

import gscdn.miniZen.model.Manager;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ManagerMapper {
    Manager getManager(String name); //이름으로 가져오기
    List<Manager> getManagerList();
    int createManager(Manager manager);
    int updateManager(Manager manager);
    int deleteManager(String name);
}
