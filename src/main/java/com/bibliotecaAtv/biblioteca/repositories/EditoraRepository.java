package com.bibliotecaAtv.biblioteca.repositories;


import com.bibliotecaAtv.biblioteca.domains.Editora;
import com.bibliotecaAtv.biblioteca.domains.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EditoraRepository extends JpaRepository<Editora,Long> {
    Optional<Editora> findbycnpj(String isbn);
}

