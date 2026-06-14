package bachtiar.firdaus.belajar_spring_dasar;

import bachtiar.firdaus.belajar_spring_dasar.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DuplicateConfiguration {

    @Bean
    public Foo foo1(){
        return new Foo();
    }

    @Bean
    public Foo foo2(){
        return new Foo();
    }

}
