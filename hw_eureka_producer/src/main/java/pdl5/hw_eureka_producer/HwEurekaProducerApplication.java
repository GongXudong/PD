package pdl5.hw_eureka_producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HwEurekaProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HwEurekaProducerApplication.class, args);
    }
}
