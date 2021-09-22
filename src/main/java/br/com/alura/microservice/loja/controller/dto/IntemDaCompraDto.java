package br.com.alura.microservice.loja.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IntemDaCompraDto {
    private Long id;
    private int quantidade;

}
