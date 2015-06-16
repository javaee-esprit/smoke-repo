package unygo.smoke.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "unygo.smoke")
@Import(MongoConfig.class)
public class AppConfig {

}
