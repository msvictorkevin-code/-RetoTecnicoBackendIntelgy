package com.intely.test.webrest.usuarios.demo.controllers;

import com.intely.test.webrest.usuarios.demo.dto.UsuarioDTORequest;
import com.intely.test.webrest.usuarios.demo.services.UsuarioService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.hamcrest.Matchers.containsString;

@AutoConfigureMockMvc
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class UsuarioRestControllerTest {


    @Autowired
    UsuarioRestController usuarioRestController;

    @Autowired
    UsuarioService service;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void contextLoads() throws Exception {
        Assertions.assertNotNull(usuarioRestController);
    }

    @Test
    void Get_All_Usuarios_All_Not_Null() {

        ResponseEntity<UsuarioDTORequest> responseEntity = usuarioRestController.getUsuarioAll();
        Assertions.assertNotNull(responseEntity);
    }

    @Test
    void Get_All_Usuarios_All_Http_OK() {
        ResponseEntity<UsuarioDTORequest> responseEntity = usuarioRestController.getUsuarioAll();
        Assertions.assertNotNull(responseEntity);
        Assertions.assertEquals(200, responseEntity.getStatusCodeValue());
    }

    @Test
    public void Get_All_Usuarios_All_Rest_Data_Contains_Result() throws Exception {
        this.mockMvc.perform(post("/api/usuarios")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("totalRegistro")));
    }
}
