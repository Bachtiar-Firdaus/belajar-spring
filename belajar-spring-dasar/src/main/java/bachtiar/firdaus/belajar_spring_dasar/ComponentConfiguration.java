package bachtiar.firdaus.belajar_spring_dasar;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import bachtiar.firdaus.belajar_spring_dasar.data.MultiFoo;

@Configuration
@ComponentScan(basePackages = {
        "bachtiar.firdaus.belajar_spring_dasar.repository",
        "bachtiar.firdaus.belajar_spring_dasar.service",
        "bachtiar.firdaus.belajar_spring_dasar.configuration",
})
@Import(MultiFoo.class)
public class ComponentConfiguration {
}
