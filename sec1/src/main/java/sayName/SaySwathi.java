package sayName;

import org.springframework.stereotype.Component;

@Component // marks the class as spring bean which makes it avaialbe for dependency injection
public class SaySwathi  implements  SayName{
    @Override
    public String getName() {
        return " Hello Swathi !";
    }
}
