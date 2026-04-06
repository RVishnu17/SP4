package sayName;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class sayVishnu implements SayName{

    @PostConstruct
    public void getStatusPC()
    {
        System.out.println( "VIshnu PreConst");
    }
    @Override
    public String getName() {
        return " Hello Vishnu! ";
    }
    @PreDestroy
    public void getStatusPD()
    {
        System.out.println( "Vishnu PreDestroy");;
    }
}
