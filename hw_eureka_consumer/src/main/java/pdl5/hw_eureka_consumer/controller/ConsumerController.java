package pdl5.hw_eureka_consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pdl5.hw_eureka_consumer.remote.HelloRemote;

import javax.servlet.http.HttpServletResponse;

@RestController
public class ConsumerController {

    @Autowired
    HelloRemote HelloRemote;

//    @RequestMapping("/hello/{name}")
//    public String index(@PathVariable("name") String name) {
//        return HelloRemote.hello(name);
//    }

    @RequestMapping("/hello2")
    public String index(@RequestParam(value="name")String name) throws Exception{
        return HelloRemote.hello2(name);
    }
}
