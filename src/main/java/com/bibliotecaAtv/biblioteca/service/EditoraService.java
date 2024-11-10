package com.bibliotecaAtv.biblioteca.service;

import com.bibliotecaAtv.biblioteca.domains.Autor;
import com.bibliotecaAtv.biblioteca.domains.Editora;
import com.bibliotecaAtv.biblioteca.domains.Livro;
import com.bibliotecaAtv.biblioteca.domains.dtos.EditoraDTO;
import com.bibliotecaAtv.biblioteca.repositories.EditoraRepository;
import com.bibliotecaAtv.biblioteca.service.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EditoraService {

    @Autowired
    private EditoraRepository editoraRepo;

    public List<EditoraDTO> findAll(){
        return editoraRepo.findAll().stream()
                .map(obj -> new EditoraDTO(obj))
                .collect(Collectors.toList());
    }
    public Editora findbyId(Long id){
        Optional<Editora> obj = editoraRepo.findById(id);
        return obj.orElseThrow(()-> new ObjectNotFoundException("Editora não encontrada! Editora: " + id));
    }

    public Editora findbycnpj(String cnpj){
        Optional<Editora> obj = editoraRepo.findbycnpj(cnpj);
        return obj.orElseThrow(()-> new ObjectNotFoundException("CNPJ não encontrado! CNPJ: " + cnpj));
    }
}
