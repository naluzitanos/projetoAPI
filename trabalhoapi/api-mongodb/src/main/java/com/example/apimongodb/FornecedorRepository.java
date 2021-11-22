package com.example.apimongodb;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = "fornecedor", path = "fornecedor")
public interface FornecedorRepository extends MongoRepository <Fornecedor, String> {
    
    List <Fornecedor> findByNomeContaining(String nome);
    List <Fornecedor> findByTelefone(String telefone);
}
