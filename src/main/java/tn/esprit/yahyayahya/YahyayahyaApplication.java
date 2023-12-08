package tn.esprit.yahyayahya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@EnableAspectJAutoProxy
@EnableScheduling

@SpringBootApplication
public class YahyayahyaApplication {

	public static void main(String[] args) {
		SpringApplication.run(YahyayahyaApplication.class, args);
	}

}
