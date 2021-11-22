package com.example.apimongodb;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = "categorias", path = "categorias")
public interface CategoriaRepository extends MongoRepository <Categoria, String> {
    
    List <Categoria> findByNome(String nome);
}
