package learning.init.Rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHello {
    @Value("${swathi.name}")
    public String swathi;
    @Value("${vishnu.name}")
    public String vishnu;
    @GetMapping("/")
    public String SayHello()
    {
        return ("Hello !" + swathi + "Kannukkutty loves " +  vishnu + " !  " );
    }

    @GetMapping("/bye")
    public String SayBye() {return "Bye Swathi kannukutty!";}

}

