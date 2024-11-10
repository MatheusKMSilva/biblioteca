package com.bibliotecaAtv.biblioteca.domains.dtos;

import com.bibliotecaAtv.biblioteca.domains.Autor;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class AutorDTO {


    private int id;

    @NotNull(message = "O campo Nome não pode ser nulo!")
    @NotBlank(message = "O campo Nome não pode ser vazio!")
    private String nome;

    @NotNull(message = "O campo Documento Pessoal não pode ser nulo!")
    @NotBlank(message = "O campo Documento Pessoal não pode ser vazio!")
    private String documentoPessoal;

    public AutorDTO() {
    }

    public AutorDTO(Autor autor) {
        this.id = autor.getId();
        this.nome = autor.getNome();
        this.documentoPessoal = autor.getDocumentoPessoal();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public @NotNull(message = "O campo Nome não pode ser nulo!") @NotBlank(message = "O campo Nome não pode ser vazio!") String getNome() {
        return nome;
    }

    public void setNome(@NotNull(message = "O campo Nome não pode ser nulo!") @NotBlank(message = "O campo Nome não pode ser vazio!") String nome) {
        this.nome = nome;
    }

    public @NotNull(message = "O campo Documento Pessoal não pode ser nulo!") @NotBlank(message = "O campo Documento Pessoal não pode ser vazio!") String getDocumentoPessoal() {
        return documentoPessoal;
    }

    public void setDocumentoPessoal(@NotNull(message = "O campo Documento Pessoal não pode ser nulo!") @NotBlank(message = "O campo Documento Pessoal não pode ser vazio!") String documentoPessoal) {
        this.documentoPessoal = documentoPessoal;
    }
}
