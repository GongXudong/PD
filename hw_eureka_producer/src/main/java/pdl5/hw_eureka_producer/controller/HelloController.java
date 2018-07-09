package pdl5.hw_eureka_producer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class HelloController {

    @Value("${server1}")
    private String server1;

//    @RequestMapping("/hello")
//    public String index(@RequestParam String name) {
//        return "hello "+name+"，this is first messge";
//    }
    @RequestMapping("/hello")
    public void index(HttpServletResponse response) throws Exception{
        response.sendRedirect(this.server1);
    }

    @RequestMapping("/hello2")
    public String hello2(@RequestParam(value="name") String name){
        return "Hello, " + name + ". This is from producer 1." + this.server1;
    }

}
