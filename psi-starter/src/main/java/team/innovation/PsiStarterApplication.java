package team.innovation;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@EnableAdminServer
public class PsiStarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(PsiStarterApplication.class, args);
    }

}
