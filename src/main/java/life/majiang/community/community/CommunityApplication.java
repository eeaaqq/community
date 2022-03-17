package life.majiang.community.community;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
1.跟application在同一级或者下一级的目录里面的注解都会自动加入进去。
2.登陆：
	麻将社区携带authorize到github
	github回调redirect-url携带code到麻将社区
	麻将社区access_token携带code到github
	github返回access_token到麻将社区
	麻将社区user携带access_token到github
	github返回user信息到github
 */

@SpringBootApplication
public class CommunityApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommunityApplication.class, args);
	}

}
