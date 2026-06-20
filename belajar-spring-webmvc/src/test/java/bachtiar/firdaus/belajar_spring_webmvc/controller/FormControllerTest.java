package bachtiar.firdaus.belajar_spring_webmvc.controller;


import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class FormControllerTest {

    @Autowired
    private MockMvc mockMvc;

//    @Test
//    void createPerson() throws Exception{
//        mockMvc.perform(
//                post("/form/person")
//                        .contentType(MediaType.APPLICATION_FORM_URLENCODED)
//                        .param("name", "Eko")
//                        .param("birthDate", "1990-10-10")
//                        .param("address", "Indonesia")
//        ).andExpectAll(
//                status().isOk(),
//                content().string(Matchers.containsString("Success create Person with name : Eko, " +
//                        "birthDate : 1990-10-10, " +
//                        "address : Indonesia"))
//        );
//    }

    @Test
    void formHello() throws Exception {
        mockMvc.perform(
                post("/form/hello")
                        .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                        .param("name", "Eko")
        ).andExpectAll(
                status().isOk(),
                header().string(HttpHeaders.CONTENT_TYPE, Matchers.containsString(MediaType.TEXT_HTML_VALUE)),
                content().string(Matchers.containsString("Hello Eko"))
        );
    }

}