package gscdn.miniZen.Service;

import gscdn.miniZen.model.Manager;
import gscdn.miniZen.repository.ManagerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service("ManagerService")
public class ManagerServiceImpl implements ManagerService {

    @Autowired
    private ManagerMapper managerMapper;

    @Override  //이름으로 조회
    public ArrayList<Manager> getManager(Manager manager) {
        return managerMapper.getManager(manager);
    }

    @Override
    @Transactional //전체 영업 담당자(manager) 조회
    public ArrayList<Manager> getManagerList() {
        return managerMapper.getManagerList();
    }

    @Override //추가
    public void createManager(Manager manager) {
        managerMapper.createManager(manager);
    }

    @Override  //수정
    public void updateManager(Manager manager) {
        managerMapper.updateManager(manager);
    }

    @Override  //삭제
    public void deleteManager(Manager manager) {
        managerMapper.deleteManager(manager);
    }
}
