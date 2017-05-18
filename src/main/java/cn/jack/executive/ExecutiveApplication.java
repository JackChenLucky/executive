package cn.jack.executive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class ExecutiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExecutiveApplication.class, args);
	}
}
