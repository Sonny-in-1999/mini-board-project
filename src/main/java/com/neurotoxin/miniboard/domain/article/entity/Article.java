package com.neurotoxin.miniboard.domain.article.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Embedded;
import javax.persistence.Id;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Date;

@Document(collection = "Article")
@Getter
@NoArgsConstructor
public class Article {
    @Id
    private ObjectId _id;
    private String content;
    private Array tag;
    private Date created;
    private String createdBy;
    private Date updated;
    private String updatedBy;
    @Embedded
    private Comment comment;


}
