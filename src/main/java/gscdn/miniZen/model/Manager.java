package gscdn.miniZen.model;

import lombok.Builder;
import lombok.Data;

//VO
@Data
public class Manager {
    //private Integer code; //행번호
    private String name; //운영 관리자 이름
    private String phone; //핸드폰 번호
    private String email; //이메일
    private String company; //회사

    public Manager(){}

    @Builder

    public Manager(String name, String phone, String email, String company) {

        this.name = name;
        this.phone = phone;
        this.email = email;
        this.company = company;
    }
}
