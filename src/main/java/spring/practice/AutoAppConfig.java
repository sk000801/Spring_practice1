package spring.practice;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        basePackages = "spring.practice",
        excludeFilters = @ComponentScan.Filter(type= FilterType.ANNOTATION) //,classes = Configuration.class)
)
public class AutoAppConfig {

}
