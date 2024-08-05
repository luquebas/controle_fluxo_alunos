package com.fluxoDeAlunos.demo.DTOs.CursoDTOs;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CursoPostDTO(@NotBlank String nome, @NotNull Integer duracao) {
    
}
