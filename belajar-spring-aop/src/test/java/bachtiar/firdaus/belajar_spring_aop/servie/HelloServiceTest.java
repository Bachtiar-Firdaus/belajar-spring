package bachtiar.firdaus.belajar_spring_aop.servie;

import bachtiar.firdaus.belajar_spring_aop.service.HelloService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HelloServiceTest {

    @Autowired
    private HelloService helloService;

    @Test
    void helloService() {
        Assertions.assertEquals("Hello Eko", helloService.hello("Eko"));
//        Assertions.assertEquals("Hello Eko Khannedy", helloService.hello("Eko", "Khannedy"));
        Assertions.assertEquals("Bye Eko", helloService.bye("Eko"));

//        helloService.test();
    }
}
