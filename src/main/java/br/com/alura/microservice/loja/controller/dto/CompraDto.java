package br.com.alura.microservice.loja.controller.dto;

import lombok.Data;

import java.util.List;

@Data
public class CompraDto {
    private List<IntemDaCompraDto> itens;
    private EnderecoDto endereco;
}
