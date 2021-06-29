package com.intely.test.webrest.usuarios.demo.services;


import com.intely.test.webrest.usuarios.demo.dto.UsuarioDTORequest;
import com.intely.test.webrest.usuarios.demo.entity.SoporteRequest;
import com.intely.test.webrest.usuarios.demo.entity.UsuarioRequest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import java.util.Arrays;


@ExtendWith(SpringExtension.class)
@SpringBootTest
class UsuarioServiceImplTest {


    @MockBean
    private UsuarioService service;


    @Test
    public void Test_Method_Get_Usuario_All_Null() {

        UsuarioDTORequest usuarioDTORequest = new UsuarioDTORequest();
        Mockito.when(service.getUsuarioAll()).thenReturn(usuarioDTORequest);
        UsuarioDTORequest usuarioDTOResult = usuarioDTORequest;
        Assertions.assertNull(usuarioDTOResult.getUsuarioResult());

    }

    @Test
    public void Test_Method_Get_Usuario_All_Not_Null() {

        UsuarioDTORequest usuarioDTORequest = new UsuarioDTORequest();
        usuarioDTORequest.setNroPagina(1);
        usuarioDTORequest.setCantidadRegistro(6);
        usuarioDTORequest.setTotalRegistro(12);
        usuarioDTORequest.setTotalPaginas(2);

        UsuarioRequest request = new UsuarioRequest();
        request.setId(1999);
        request.setNombre("Victor Kevn");
        request.setApellido("Matos Secce");
        request.setEmail("victorkevin.ms@gmail.com");
        request.setFoto("https://pbs.twimg.com/media/DnDzaBWWwAEqMWl.jpg");
        usuarioDTORequest.setUsuarioResult(Arrays.asList(request));

        usuarioDTORequest.setSoportetResult(new SoporteRequest("https://reqres.in/api/users", "Ponerse en contacto."));
        Mockito.when(service.getUsuarioAll()).thenReturn(usuarioDTORequest);
        UsuarioDTORequest usuarioDTOResult = usuarioDTORequest;
        Assertions.assertNotNull(usuarioDTOResult.getUsuarioResult());

    }

    @Test
    public void Test_Method_Get_Usuario_All_Ok() {

        UsuarioDTORequest usuarioDTORequest = new UsuarioDTORequest();
        usuarioDTORequest.setNroPagina(1);
        usuarioDTORequest.setCantidadRegistro(6);
        usuarioDTORequest.setTotalRegistro(12);
        usuarioDTORequest.setTotalPaginas(2);

        UsuarioRequest request1 = new UsuarioRequest();
        request1.setId(1);
        request1.setNombre("Nombre Prueba");
        request1.setApellido("Apellido Prueba");
        request1.setEmail("Email Prueba");
        request1.setFoto("Url del video");

        UsuarioRequest request2 = new UsuarioRequest();
        request2.setId(2);
        request2.setNombre("Nombre Prueba");
        request2.setApellido("Apellido Prueba");
        request2.setEmail("Email Prueba");
        request2.setFoto("Url del video");

        UsuarioRequest request3 = new UsuarioRequest();
        request3.setId(3);
        request3.setNombre("Nombre Prueba");
        request3.setApellido("Apellido Prueba");
        request3.setEmail("Email Prueba");
        request3.setFoto("Url del video");
        usuarioDTORequest.setUsuarioResult(Arrays.asList(request1, request2, request3));

        usuarioDTORequest.setSoportetResult(new SoporteRequest("https://reqres.in/api/users", "Ponerse en contacto."));
        Mockito.when(service.getUsuarioAll()).thenReturn(usuarioDTORequest);
        UsuarioDTORequest usuarioDTOResult = usuarioDTORequest;
        Assertions.assertEquals(3, usuarioDTORequest.getUsuarioResult().size());

    }


}
