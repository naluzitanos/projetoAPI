package com.example.apimongodb;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = "cidades", path = "cidades")
public interface CidadesRepository extends MongoRepository <Cidades, String> {
    
    List <Cidades> findByNome(String id);
}