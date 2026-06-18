package bachtiar.firdaus.belajar_spring_validation.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
// Ganti javax ke jakarta
import jakarta.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    @NotBlank
    private String id;

    @NotBlank
    private String name;

}