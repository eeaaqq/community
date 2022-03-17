package life.majiang.community.community;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
1.跟application在同一级或者下一级的目录里面的注解都会自动加入进去。
 */

@SpringBootApplication
public class CommunityApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommunityApplication.class, args);
	}

}
