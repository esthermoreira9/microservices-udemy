package org.br.mineradora.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;

@Jacksonized //Permite que a classe seja lida como objeto JSON
@Data //Gera os getters and setters
@NoArgsConstructor
@AllArgsConstructor //Construtor padrão com todos os atributos
public class CurrencyPriceDTO {

    public USDBRL USDBRL;
}
