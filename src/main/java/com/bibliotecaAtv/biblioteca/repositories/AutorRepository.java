package com.bibliotecaAtv.biblioteca.repositories;

import com.bibliotecaAtv.biblioteca.domains.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends JpaRepository<Autor,Long> {

}

