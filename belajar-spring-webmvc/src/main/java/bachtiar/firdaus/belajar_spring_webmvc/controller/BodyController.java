package bachtiar.firdaus.belajar_spring_webmvc.controller;

import bachtiar.firdaus.belajar_spring_webmvc.model.HelloRequest;
import bachtiar.firdaus.belajar_spring_webmvc.model.HelloResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.server.ResponseStatusException;
import tools.jackson.databind.ObjectMapper;

@Controller
public class BodyController {

    @Autowired
    private ObjectMapper objectMapper;

    @PostMapping(
            path = "/body/hello",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseBody
    public String body(@RequestBody String requestBody) {
        try {
            HelloRequest request = objectMapper.readValue(requestBody, HelloRequest.class);

            HelloResponse response = new HelloResponse();
            response.setHello("Hello " + request.getName());

            return objectMapper.writeValueAsString(response);
        } catch (Exception e) {
            // Mengembalikan HTTP 400 Bad Request jika parsing JSON gagal
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid JSON Format", e);
        }
    }
}