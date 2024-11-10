package com.bibliotecaAtv.biblioteca.service;

import com.bibliotecaAtv.biblioteca.domains.Autor;
import com.bibliotecaAtv.biblioteca.domains.Editora;
import com.bibliotecaAtv.biblioteca.domains.Livro;
import com.bibliotecaAtv.biblioteca.domains.enums.Conservacao;
import com.bibliotecaAtv.biblioteca.domains.enums.Status;
import com.bibliotecaAtv.biblioteca.repositories.AutorRepository;
import com.bibliotecaAtv.biblioteca.repositories.EditoraRepository;
import com.bibliotecaAtv.biblioteca.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;

@Service
public class DBService {

    @Autowired
    private AutorRepository autorRepo;

    @Autowired
    private EditoraRepository editoraRepo;

    @Autowired
    private LivroRepository livroRepo;

    public void initDB(){
        Autor autor01 = new Autor(0,"Machado de Assis","01");
        Autor autor02 = new Autor(0,"Clarice Lispector","02");

        Editora editora01 = new Editora(0,"0000-01","Editora ATICA");
        Editora editora02 = new Editora(0,"0000-02","Editora Epoca");

        Livro livro01 = new Livro(0, "O menindo do pijama Listrado", "1111", 60, LocalDate.now(),new BigDecimal("45.9"),autor01,editora01, Status.NAOLIDO, Conservacao.EXCELENTE);
        Livro livro02 = new Livro(0, "Shrek", "2222", 40, LocalDate.now(),new BigDecimal("90.0"),autor02,editora02, Status.LENDO, Conservacao.GASTO);
        Livro livro03 = new Livro(0, "O pequeno Principe", "3333", 101, LocalDate.now(),new BigDecimal("25.0"),autor01,editora02, Status.NAOLIDO, Conservacao.MARCASDEUSO);
        Livro livro04 = new Livro(0, "Diario de um banana", "4444", 25, LocalDate.now(),new BigDecimal("9.99"),autor02,editora01, Status.LIDO, Conservacao.BOM);

        autorRepo.save(autor01);
        autorRepo.save(autor02);

        editoraRepo.save(editora01);
        editoraRepo.save(editora02);

        livroRepo.save(livro01);
        livroRepo.save(livro02);
        livroRepo.save(livro03);
        livroRepo.save(livro04);

    }


}