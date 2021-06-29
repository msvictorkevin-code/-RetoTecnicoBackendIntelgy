package com.intely.test.webrest.usuarios.demo.restclient.entity;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;


public class UsuarioResponse {


    private Integer id;
    private String nombre;
    private String apellido;
    private String email;
    private String foto;


    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("first_name")
    public String getNombre() {
        return nombre;
    }

    @JsonProperty("first_name")
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @JsonProperty("last_name")
    public String getApellido() {
        return apellido;
    }

    @JsonProperty("last_name")
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("avatar")
    public String getFoto() {
        return foto;
    }

    @JsonProperty("avatar")
    public void setAvatar(String foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                        ", nombre='" + nombre + '\'' +
                        ", apellido='" + apellido + '\'' +
                        ", email='" + email + '\'' +
                        ", foto='" + foto + '\'';
    }
}
