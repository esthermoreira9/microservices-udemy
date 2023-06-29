package org.br.mineradora.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.br.mineradora.entity.QuotationEntity;

@ApplicationScoped //Escopo do Quarkus - Essa anotação significa que ele vai gerenciar a classe
public class QuotationRepository implements PanacheRepository<QuotationEntity> {

}
