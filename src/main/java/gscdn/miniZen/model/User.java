package gscdn.miniZen.model;

import lombok.Data;

@Data
public class User {
    private String user_name;
    private String user_email; //이메일이 아이디이고, 가입시 인증 메일을 보내도록. pk.
    private String user_password;
}
