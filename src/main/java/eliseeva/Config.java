package eliseeva;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan ("eliseeva")
@PropertySource ("variable.properties")
public class Config {

}
