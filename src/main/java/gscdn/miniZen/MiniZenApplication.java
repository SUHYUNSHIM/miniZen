package gscdn.miniZen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
//@Configuration
//@EnableAutoConfiguration(exclude = {DataSourceTransactionManagerAutoConfiguration.class, DataSourceAutoConfiguration.class})
//@ComponentScan(basePackages = "gscdn.miniZen")
public class MiniZenApplication {

	//첫 접속 시 로그인창이 뜸.
	//user, 비밀번호: 콘솔에 찍히는 것으로.

	public static void main(String[] args) {
		SpringApplication.run(MiniZenApplication.class, args);
	}

}
