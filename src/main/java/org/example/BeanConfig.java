package org.example;
import org.springframework.context.annotation.Bean;

public class BeanConfig {
    @Bean
    public Car car() {
        return new Car("MyCar", engine());
    }

    @Bean
    public Engine engine() {
        return new Engine(11,"V8");
    }
    @Bean
    public Car car2() {
        return new Car("MyCar2", engine2());
    }
    @Bean
    public Engine engine2() {
        return new Engine(22,"V6");
    }



}
