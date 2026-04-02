package learning.init.Rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHello {

    @GetMapping("/")
    public String SayHello()
    {
        return "Hello Swathi!";
    }

    @GetMapping("/bye")
    public String SayBye() {return "Bye Swathi kannukutty!";}

}

