package app.web.nakama;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
(exclude = {DataSourceAutoConfiguration.class })
public class NakamaApplication {

	public static void main(String[] args) {
		SpringApplication.run(NakamaApplication.class, args);
	}

}
