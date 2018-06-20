package pdl5.hw_eureka1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class HwEureka1Application {

    public static void main(String[] args) {
        SpringApplication.run(HwEureka1Application.class, args);
    }
}
