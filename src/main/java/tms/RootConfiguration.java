package tms;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "tms")
public class RootConfiguration {

    @Bean
    public ConsoleWriter writer() {
        return new ConsoleWriter();
    }

    @Bean
    public ConsoleReader reader() {
        return new ConsoleReader();
    }

    @Bean
    public CalculatorService calculatorService() {
        return new CalculatorService();
    }

}