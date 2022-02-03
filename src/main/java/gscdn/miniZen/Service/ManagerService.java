package gscdn.miniZen.Service;

import gscdn.miniZen.model.Manager;
import gscdn.miniZen.repository.ManagerMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagerService {
    ManagerMapper managerMapper;
    public ManagerService(ManagerMapper managerMapper){ //ManagerMapper를 DI 받음.
        this.managerMapper = managerMapper;
    }
    public List<Manager> getManagerList(){
        return managerMapper.getManagerList();
    }
    public Manager getManager(String name){
        return managerMapper.getManager(name);
    }
    public int createManager(Manager manager){
        return managerMapper.updateManager(manager);
    }
    public int deleteManager(String name){
        return managerMapper.deleteManager(name);
    }
}
