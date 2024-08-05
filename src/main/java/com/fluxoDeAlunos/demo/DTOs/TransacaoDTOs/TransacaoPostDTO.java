package com.fluxoDeAlunos.demo.DTOs.TransacaoDTOs;

import java.time.LocalDateTime;

import com.fluxoDeAlunos.demo.Models.Usuario;
import com.fluxoDeAlunos.demo.Models.Enums.TipoTransacao;

import jakarta.validation.constraints.NotNull;

public record TransacaoPostDTO(@NotNull Usuario usuario, @NotNull TipoTransacao tipoTransacao, @NotNull LocalDateTime horario) {
    
}
