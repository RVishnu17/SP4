package learning.init.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sayName.SayName;

@RestController
public class Controller {
    private SayName sayName;
    private SayName sayName1;
    private SayName sayName2;
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
    public void setterFunction(@Qualifier("sayVishnu") SayName sayName1,
                               @Qualifier("saySwathi") SayName sayName2, @Qualifier("beanCustomId") SayName sayName3                            )
    {
        sayName = sayName1;
        this.sayName1 = sayName2;
        this.sayName2 = sayName3;
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
    @GetMapping("/sayName")
    public String sayName() {
        return ("is Same  = " + (sayName==sayName1)+  sayName.getName() + " " + sayName1.getName() + " " + sayName2.getName());
    }
    @GetMapping("/bye")
    public String SayBye() {return "Bye Swathi kannukutty!";}

}

