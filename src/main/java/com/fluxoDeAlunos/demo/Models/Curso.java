package com.fluxoDeAlunos.demo.Models;
import java.util.UUID;
import com.fluxoDeAlunos.demo.DTOs.CursoDTOs.CursoPostDTO;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Curso {

    public Curso(CursoPostDTO cursoPostDTO) {
        this.nome = cursoPostDTO.nome();
        this.duracao = cursoPostDTO.duracao();
    }

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "nome")
    private String nome;
    
    @Column(name = "duracao")
    private Integer duracao;
    
}
