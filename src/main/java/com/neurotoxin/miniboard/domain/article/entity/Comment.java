package com.neurotoxin.miniboard.domain.article.entity;

import org.bson.types.ObjectId;

import javax.persistence.Id;
import java.math.BigInteger;
import java.util.Date;

public class Comment {
    @Id
    private BigInteger id;
    private String content;
    private Date created;
    private String createdBy;
    private Date updated;
    private String updatedBy;
}
