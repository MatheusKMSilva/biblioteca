package com.bibliotecaAtv.biblioteca.repositories;

import com.bibliotecaAtv.biblioteca.domains.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {

    Optional<Livro> findbyisbn(String isbn);

}