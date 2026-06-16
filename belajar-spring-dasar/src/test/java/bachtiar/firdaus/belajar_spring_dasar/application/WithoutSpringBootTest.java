package bachtiar.firdaus.belajar_spring_dasar.application;

import bachtiar.firdaus.belajar_spring_dasar.data.Foo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class WithoutSpringBootTest {

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(FooApplication.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testFoo() {
        Foo foo = applicationContext.getBean(Foo.class);
    }
}
