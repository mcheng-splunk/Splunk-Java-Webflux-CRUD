package com.crud.SplunkJavaWebfluxCRUD.repository;

import com.crud.SplunkJavaWebfluxCRUD.model.Tutorial;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;


import reactor.core.publisher.Flux;

@Repository
public interface TutorialRepository extends R2dbcRepository<Tutorial, Integer>{
    Flux<Tutorial> findByTitleContaining(String title);

    Flux<Tutorial> findByPublished(boolean isPublished);
}