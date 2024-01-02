package employees;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/")
public class HelloWorldController {

    private HelloService hc;

    HelloWorldController(HelloService hc){
        this.hc = hc;
    }

    @RequestMapping("hi")
    public String helloWorld()
    {
        return hc.sayHello();
    }

    @RequestMapping("bye")
    public String goodbye(){
        return "Goodbye Tomi!" + LocalDateTime.now();
    }
}
