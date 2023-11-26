package app1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages="app1")
@PropertySource("classpath:data.properties")
public class JavaConfig {

}
