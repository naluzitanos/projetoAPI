package com.example.apimongodb;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "produto", path = "produto")
public interface ProdutoRepository extends MongoRepository <Produto, String> {

    @Query("{'fornecedor_id': ?0}")
    List<Produto> findProdutoByFornecedorId(String id);
    
}
