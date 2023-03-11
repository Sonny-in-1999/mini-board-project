package com.neurotoxin.miniboard.domain.web.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "database_sequences")
public class DbSequence {

    @Id
    private String id;
    private Long seq;
}