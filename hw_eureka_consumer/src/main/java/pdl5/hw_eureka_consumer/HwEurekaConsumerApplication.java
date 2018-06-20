package pdl5.hw_eureka_consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class HwEurekaConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HwEurekaConsumerApplication.class, args);
    }
}
