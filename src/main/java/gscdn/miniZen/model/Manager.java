package gscdn.miniZen.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

//VO, domain
@Data
public class Manager {
    private Integer code; //행번호. 직접 입력X, 게시물 작성 후 자동 생성. 호출할 수도 없다.
    private String name; //운영 관리자 이름
    private String phone; //핸드폰 번호
    private String email; //이메일
    private String company; //회사

}
