package com.fluxoDeAlunos.demo.DTOs.UsuarioDTOs;
import java.time.LocalDate;
import com.fluxoDeAlunos.demo.Models.Curso;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;

public record UsuarioPostDTO(@NotBlank String nome, @Past LocalDate data_nascimento,@NotNull Curso curso, @NotBlank String matricula, @NotBlank String cpf, @NotBlank String email, @NotBlank String senha) {
    
}
