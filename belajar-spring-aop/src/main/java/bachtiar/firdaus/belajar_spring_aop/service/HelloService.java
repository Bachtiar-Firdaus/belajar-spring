package bachtiar.firdaus.belajar_spring_aop.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class HelloService {

    // Membuat logger manual menggunakan SLF4J bawaan Spring Boot
    private static final Logger log = LoggerFactory.getLogger(HelloService.class);

    public String hello(String name) {
        log.info("Call HelloService.hello()");
        return "Hello " + name;
    }

//    public String hello(String firstName, String lastName) {
//        log.info("Call HelloService.hello()");
//        return "Hello " + firstName + " " + lastName;
//    }

    public String bye(String name) {
        log.info("Call HelloService.bye()");
        return "Bye " + name;
    }

//    public void test(){
//        log.info("Call HelloService.test()");
//    }

}