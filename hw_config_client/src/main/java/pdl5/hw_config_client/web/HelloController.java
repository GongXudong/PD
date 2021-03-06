package pdl5.hw_config_client.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${hello}")
    private String hello;

    @Value("${server1}")
    private String server1;

    @RequestMapping("/hello")
    public String from(){
        return this.hello + '\n' + this.server1;
    }
}
