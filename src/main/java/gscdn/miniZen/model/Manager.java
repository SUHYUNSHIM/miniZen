package gscdn.miniZen.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

//VO, domain
@Data
public class Manager {
    private Integer code; //행번호
    private String name; //운영 관리자 이름
    private String phone; //핸드폰 번호
    private String email; //이메일
    private String company; //회사

}
