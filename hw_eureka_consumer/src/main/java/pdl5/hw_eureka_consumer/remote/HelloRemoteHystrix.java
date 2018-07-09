package pdl5.hw_eureka_consumer.remote;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class HelloRemoteHystrix implements HelloRemote {

    @Override
    public String hello2(@RequestParam(value="name")String name) throws Exception{
        return "hello, " + name + ". This is the default setting.";
    }

}
