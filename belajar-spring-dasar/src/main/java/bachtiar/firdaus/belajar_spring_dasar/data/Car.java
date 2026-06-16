package bachtiar.firdaus.belajar_spring_dasar.data;

import bachtiar.firdaus.belajar_spring_dasar.aware.IdAware;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
public class Car implements IdAware {

    @Getter
    private String id;

    @Override
    public void setId(String id) {
        this.id = id;
    }
}
