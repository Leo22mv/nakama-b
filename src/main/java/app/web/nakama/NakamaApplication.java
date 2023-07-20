// V 1.0



package app.web.nakama;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("app.web.nakama")
@SpringBootApplication
// (exclude = {DataSourceAutoConfiguration.class })
public class NakamaApplication {

	public static void main(String[] args) {
		SpringApplication.run(NakamaApplication.class, args);
	}

}
