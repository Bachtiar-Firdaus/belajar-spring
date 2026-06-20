package bachtiar.firdaus.belajar_spring_webmvc.controller;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.web.servlet.MockMvc;

import java.io.File; // Pastikan import ini ada

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class UploadControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void uploadFile() throws Exception {
        // Membuat path dinamis mengikuti OS
        String expectedPath = "upload" + File.separator + "profile.png";

        mockMvc.perform(
                multipart("/upload/profile")
                        .file(new MockMultipartFile("profile", "profile.png", "image/png",
                                getClass().getResourceAsStream("/images/profile.png")))
                        .contentType(MediaType.MULTIPART_FORM_DATA)
                        .param("name", "Eko")
        ).andExpectAll(
                status().isOk(),
                // Pakai expectedPath yang dinamis
                content().string(Matchers.containsString("Success save profile Eko to " + expectedPath))
        );
    }
}