package learning.init.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sayName.SayName;

@RestController
public class Controller {
    private SayName sayName;
/*
*  Constructor Injection
*  @Autowired // tells spring to/inject a dependency, if there's only on injection , then autowired is optional
    public Controller(SayName sayName1)
    {
        sayName = sayName1;
    }
*
* */
    @Autowired
    public void setterFunction(SayName sayName1)
    {
        sayName = sayName1;
    }
   /* @Value("${swathi.name}")
    public String swathi;
    @Value("${vishnu.name}")
    public String vishnu;
    */
   @GetMapping("/")
   public String SayHello()
   {
       return ("Hello !" );
   }
    @GetMapping("/saySwathi")
    public String SaySwathi() {
        return sayName.getName();
    }
    @GetMapping("/bye")
    public String SayBye() {return "Bye Swathi kannukutty!";}

}

