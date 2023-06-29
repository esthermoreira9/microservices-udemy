package org.br.mineradora.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

import java.math.BigDecimal;
import java.util.Date;

//DTO = data transfer object - trafego de dados para outras classes
@Jacksonized //Permite que a classe seja lida como objeto JSON
@Data //Gera os getters and setters
@Builder //Elimina a necessidade de criar vários construtores
@AllArgsConstructor //Construtor padrão com todos os atributos
public class QuotationDTO {

    private Date date;

    private BigDecimal currencyPrice;
}
