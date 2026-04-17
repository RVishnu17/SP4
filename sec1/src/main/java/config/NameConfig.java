package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sayName.SayName;
import sayName.sayLove;

@Configuration
public class NameConfig {
    @Bean("beanCustomId") // bean custom ID for referral in settter Injection @Qualifier(" ")
    public SayName beanIDsay() { // beanIdsay is referred in Setter Injection @Qualifier(" ")
        return new sayLove();
    }
}
