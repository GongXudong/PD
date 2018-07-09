package pdl5.hw_eureka_consumer.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;


@FeignClient(name= "spring-cloud-producer", fallback = HelloRemoteHystrix.class)
public interface HelloRemote {

    @RequestMapping(value = "/hello2")
    public String hello2(@RequestParam(value = "name")String name) throws Exception;

}