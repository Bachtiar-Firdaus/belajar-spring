package bachtiar.firdaus.belajar_spring_redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching; // Tambahkan import ini

@SpringBootApplication
@EnableCaching // Tambahkan anotasi ini di sini
public class BelajarSpringRedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(BelajarSpringRedisApplication.class, args);
	}

}