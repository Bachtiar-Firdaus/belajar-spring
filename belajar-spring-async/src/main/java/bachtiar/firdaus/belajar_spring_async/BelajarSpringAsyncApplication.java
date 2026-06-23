package bachtiar.firdaus.belajar_spring_async;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class BelajarSpringAsyncApplication {

	public static void main(String[] args) {
		SpringApplication.run(BelajarSpringAsyncApplication.class, args);
	}

}
