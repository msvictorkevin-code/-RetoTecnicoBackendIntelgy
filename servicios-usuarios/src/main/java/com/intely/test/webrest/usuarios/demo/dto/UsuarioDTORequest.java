package com.intely.test.webrest.usuarios.demo.dto;

import com.intely.test.webrest.usuarios.demo.entity.SoporteRequest;
import com.intely.test.webrest.usuarios.demo.entity.UsuarioRequest;

import java.util.List;

public class UsuarioDTORequest {

    private Integer nroPagina;
    private Integer cantidadRegistro;
    private Integer totalRegistro;
    private Integer totalPaginas;
    private List<UsuarioRequest> usuarioResult;
    private SoporteRequest soportetResult;

    public Integer getNroPagina() {
        return nroPagina;
    }

    public void setNroPagina(Integer nroPagina) {
        this.nroPagina = nroPagina;
    }

    public Integer getCantidadRegistro() {
        return cantidadRegistro;
    }

    public void setCantidadRegistro(Integer cantidadRegistro) {
        this.cantidadRegistro = cantidadRegistro;
    }

    public Integer getTotalRegistro() {
        return totalRegistro;
    }

    public void setTotalRegistro(Integer totalRegistro) {
        this.totalRegistro = totalRegistro;
    }

    public Integer getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(Integer totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public List<UsuarioRequest> getUsuarioResult() {
        return usuarioResult;
    }

    public void setUsuarioResult(List<UsuarioRequest> usuarioResult) {
        this.usuarioResult = usuarioResult;
    }

    public SoporteRequest getSoportetResult() {
        return soportetResult;
    }

    public void setSoportetResult(SoporteRequest soportetResult) {
        this.soportetResult = soportetResult;
    }

    @Override
    public String toString() {
        return "UsuarioDTORequest{" +
                "nroPagina=" + nroPagina +
                ", cantidadRegistro=" + cantidadRegistro +
                ", totalRegistro=" + totalRegistro +
                ", totalPaginas=" + totalPaginas +
                ", usuarioResult=" + usuarioResult +
                ", soportetResult=" + soportetResult +
                '}';
    }
}
