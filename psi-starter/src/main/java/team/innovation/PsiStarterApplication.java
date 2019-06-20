package team.innovation;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@EnableAdminServer
public class PsiStarterApplication {

    public static void main(String[] args) {

        SpringApplication springApplication = new SpringApplication(PsiStarterApplication.class);
        // 这个是关闭springboot启动时候的图标可以不设置
        springApplication.setBannerMode(Banner.Mode.OFF);
        SpringApplication.run(PsiStarterApplication.class, args);
    }

}
