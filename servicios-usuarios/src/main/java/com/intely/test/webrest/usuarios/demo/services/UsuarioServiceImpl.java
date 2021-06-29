package com.intely.test.webrest.usuarios.demo.services;


import com.intely.test.webrest.usuarios.demo.entity.builder.SoporteBuilder;
import com.intely.test.webrest.usuarios.demo.dto.UsuarioDTORequest;
import com.intely.test.webrest.usuarios.demo.restclient.dto.UsuarioDTOResponse;


import com.intely.test.webrest.usuarios.demo.entity.UsuarioRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.stream.Collectors;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private final static Logger LOGGER = LoggerFactory.getLogger(UsuarioServiceImpl.class);


    @Autowired
    private RestTemplate restTemplate;

    @Value("${servicio.usuario.ext.url}")
    private String url_ext_usuario;

    @Override
    public UsuarioDTORequest getUsuarioAll() {

        try {
            UsuarioDTORequest usuarioDTORequest = new UsuarioDTORequest();
            UsuarioDTOResponse response = restTemplate.getForObject(url_ext_usuario, UsuarioDTOResponse.class);
            usuarioDTORequest.setNroPagina(response.getPage());
            usuarioDTORequest.setCantidadRegistro(response.getPerPage());
            usuarioDTORequest.setTotalRegistro(response.getTotal());
            usuarioDTORequest.setTotalPaginas(response.getTotalPages());
            usuarioDTORequest.setUsuarioResult(response.getusuarioResponse()
                    .stream()
                    .map(usuarioResponse -> {
                        UsuarioRequest usuarioRequest = new UsuarioRequest();
                        usuarioRequest.setId(usuarioResponse.getId());
                        usuarioRequest.setNombre(usuarioResponse.getNombre());
                        usuarioRequest.setApellido(usuarioResponse.getApellido());
                        usuarioRequest.setEmail(usuarioResponse.getEmail());
                        usuarioRequest.setFoto(usuarioResponse.getFoto());

                        return usuarioRequest;
                    }).collect(Collectors.toList()));
            usuarioDTORequest.setSoportetResult(new SoporteBuilder()
                    .setUrl(response.getsupportResponse().getUrl())
                    .setText(response.getsupportResponse().getText())
                    .build());
            LOGGER.info("response => " + response);
            return usuarioDTORequest;


        } catch (Exception e) {
            LOGGER.error(e.getLocalizedMessage());
        }
        return null;
    }
}
