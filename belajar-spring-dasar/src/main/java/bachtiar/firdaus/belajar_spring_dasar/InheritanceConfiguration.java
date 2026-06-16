package bachtiar.firdaus.belajar_spring_dasar;

import bachtiar.firdaus.belajar_spring_dasar.service.MerchantServiceImpl;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(MerchantServiceImpl.class)
public class InheritanceConfiguration {

}
