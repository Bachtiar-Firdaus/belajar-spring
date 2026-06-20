package bachtiar.firdaus.belajar_spring_webmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.servlet.context.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

@SpringBootApplication
@ServletComponentScan
public class BelajarSpringWebmvcApplication {

	@Bean
	public RestTemplate restTemplate() {
		SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();

		// Mengatur timeout menggunakan java.time.Duration (Kompatibel dengan Spring modern)
		factory.setConnectTimeout(Duration.ofSeconds(2L));
		factory.setReadTimeout(Duration.ofSeconds(2L));

		return new RestTemplate(factory);
	}

	public static void main(String[] args) {
		SpringApplication.run(BelajarSpringWebmvcApplication.class, args);
	}

}