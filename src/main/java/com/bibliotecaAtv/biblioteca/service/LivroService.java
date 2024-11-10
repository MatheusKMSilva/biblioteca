package com.bibliotecaAtv.biblioteca.service;

import com.bibliotecaAtv.biblioteca.domains.Autor;
import com.bibliotecaAtv.biblioteca.domains.Livro;
import com.bibliotecaAtv.biblioteca.domains.dtos.LivroDTO;
import com.bibliotecaAtv.biblioteca.repositories.LivroRepository;
import com.bibliotecaAtv.biblioteca.service.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepo;

    public List<LivroDTO> findAll(){
        return livroRepo.findAll().stream()
                .map(obj -> new LivroDTO(obj))
                .collect(Collectors.toList());
    }

    public Livro findbyId(Long id){
        Optional<Livro> obj = livroRepo.findById(id);
        return obj.orElseThrow(()-> new ObjectNotFoundException("Livro não encontrado! Livro: " + id));
    }

    public Livro findbyisbn(String isbn){
        Optional<Livro> obj = livroRepo.findbyisbn(isbn);
        return obj.orElseThrow(()-> new ObjectNotFoundException("ISBN não encontrado! ISBN: " + isbn));
    }
}
