package com.bibliotecaAtv.biblioteca.service;

import com.bibliotecaAtv.biblioteca.domains.Autor;
import com.bibliotecaAtv.biblioteca.domains.Editora;
import com.bibliotecaAtv.biblioteca.domains.dtos.AutorDTO;
import com.bibliotecaAtv.biblioteca.repositories.AutorRepository;
import com.bibliotecaAtv.biblioteca.service.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AutorService {

    @Autowired
    private AutorRepository autorRepo;

    public List<AutorDTO> findAll(){
        return autorRepo.findAll().stream()
                .map(obj -> new AutorDTO(obj))
                .collect(Collectors.toList());
    }
    public Autor findbyId(Long id){
        Optional<Autor> obj = autorRepo.findById(id);
        return obj.orElseThrow(()-> new ObjectNotFoundException("Autor não encontrado! Id:" + id));
    }
}
