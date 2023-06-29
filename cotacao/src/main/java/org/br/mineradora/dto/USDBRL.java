package org.br.mineradora.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Jacksonized //Permite que a classe seja lida como objeto JSON
@Data //Gera os getters and setters
@Builder //Elimina a necessidade de criar vários construtores
@AllArgsConstructor //Construtor padrão com todos os atributos
public class USDBRL {

    public String code;
    public String codein;
    public String name;
    public String high;
    public String low;
    public String varBid;
    public String pctChange;
    public String bid;
    public String ask;
    public String timestamp;
    public String create_date;


}
