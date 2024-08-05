package com.fluxoDeAlunos.demo.Models;
import java.time.LocalDateTime;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fluxoDeAlunos.demo.DTOs.TransacaoDTOs.TransacaoPostDTO;
import com.fluxoDeAlunos.demo.Models.Enums.TipoTransacao;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Transacao {
    
    public Transacao(TransacaoPostDTO transacaoPostDTO) {
        this.usuario = transacaoPostDTO.usuario();
        this.tipoTransacao = transacaoPostDTO.tipoTransacao();
        this.horario = transacaoPostDTO.horario();
    }

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id")
    @JsonBackReference
    private Usuario usuario;

    @Column(name = "tipo_transacao")
    @Enumerated(EnumType.STRING)
    private TipoTransacao tipoTransacao;

    @Column(name = "horario")
    private LocalDateTime horario;
}
