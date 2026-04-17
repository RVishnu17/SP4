package sayName;

import org.springframework.context.annotation.Configuration;

public class sayLove implements SayName {

    public sayLove() {
        System.out.printf(" IN constructor  : " + getClass().getName() + " ");
    }

    @Override
    public String getName() {
        return "Kannukutty swathi loves vishnu ! <3";
    }
}
