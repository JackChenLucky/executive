package cn.jack.executive;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class ExecutiveApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication app = new SpringApplication(ExecutiveApplication.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}
}