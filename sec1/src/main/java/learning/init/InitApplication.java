package learning.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
		scanBasePackages = {
				"sayName",
				"learning.init",
				"config"
		}
)
public class InitApplication {

	public static void main(String[] args) {

		SpringApplication.run(InitApplication.class, args);


	}

}
