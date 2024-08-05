package com.fluxoDeAlunos.demo.Models;
import java.time.LocalDate;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fluxoDeAlunos.demo.DTOs.UsuarioDTOs.UsuarioPostDTO;
import com.fluxoDeAlunos.demo.Models.Enums.Role;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Usuario")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@EqualsAndHashCode(of = "id")
public class Usuario {
    
    public Usuario (UsuarioPostDTO usuarioPostDTO) {
        this.nome = usuarioPostDTO.nome();
        this.data_nascimento = usuarioPostDTO.data_nascimento();
        this.matricula = usuarioPostDTO.matricula();
        this.curso = usuarioPostDTO.curso();
        this.cpf = usuarioPostDTO.cpf();
        this.email = usuarioPostDTO.email();
        this.senha = usuarioPostDTO.senha();
    }

     @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "data_nascimento")
    private LocalDate data_nascimento;

    @Column(name = "matricula")
    private String matricula;

    @JoinColumn(name = "curso_id")
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference
    private Curso curso;

    @Column(name = "cpf")
    private String cpf;
    
    @Column(name = "email")
    private String email;

    @Column(name = "senha")
    private String senha;

    @Column(name = "role")
    @Enumerated(EnumType.STRING)
    private Role role;
}
