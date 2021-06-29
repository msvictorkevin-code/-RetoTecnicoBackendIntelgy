package com.intely.test.webrest.usuarios.demo.restclient.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import com.intely.test.webrest.usuarios.demo.restclient.entity.SupportResponse;
import com.intely.test.webrest.usuarios.demo.restclient.entity.UsuarioResponse;

import java.util.List;


public class UsuarioDTOResponse {

    @JsonProperty("page")
    private Integer page;
    @JsonProperty("per_page")
    private Integer perPage;
    @JsonProperty("total")
    private Integer total;
    @JsonProperty("total_pages")
    private Integer totalPages;
    @JsonProperty("data")
    private List<UsuarioResponse> usuarioResponse;

    @JsonProperty("support")
    private SupportResponse supportResponse;

    @JsonProperty("data")
    public void setusuarioResponse(List<UsuarioResponse> usuarioResponse) {
        this.usuarioResponse = usuarioResponse;
    }

    @JsonProperty("data")
    public List<UsuarioResponse> getusuarioResponse() {
        return usuarioResponse;
    }

    @JsonProperty("support")
    public SupportResponse getsupportResponse() {
        return supportResponse;
    }

    @JsonProperty("support")
    public void setsupportResponse(SupportResponse supportResponse) {
        this.supportResponse = supportResponse;
    }

    @JsonProperty("page")
    public Integer getPage() {
        return page;
    }

    @JsonProperty("page")
    public void setPage(Integer page) {
        this.page = page;
    }

    @JsonProperty("per_page")
    public Integer getPerPage() {
        return perPage;
    }

    @JsonProperty("per_page")
    public void setPerPage(Integer perPage) {
        this.perPage = perPage;
    }

    @JsonProperty("total")
    public Integer getTotal () {
        return total ;
    }

    @JsonProperty("total")
    public void setTotalRegistro(Integer total) {
        this.total  = total ;
    }

    @JsonProperty("total_pages")
    public Integer getTotalPages() {
        return totalPages;
    }

    @JsonProperty("total_pages")
    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }


    @Override
    public String toString() {
        return "UsuarioDTOResponse{" +
                "page=" + page +
                ", perPage=" + perPage +
                ", total=" + total +
                ", totalPages=" + totalPages +
                ", usuarioResponse=" + usuarioResponse +
                ", supportResponse=" + supportResponse +
                '}';
    }
}
