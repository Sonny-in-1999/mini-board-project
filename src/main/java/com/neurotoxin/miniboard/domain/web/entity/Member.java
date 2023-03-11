package com.neurotoxin.miniboard.domain.web.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Document(collection = "User")
@Configuration
@Getter
@NoArgsConstructor
public class Member {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    // userID
    private Long id;
    // userPassword
    private char[] pw;
    // userNickname
    private String name;
    // userEmail
    private String email;
    private String phone;

    @Builder
    public Member (String name, char[] pw, String email, String phone) {
        this.name = name;
        this.pw = pw;
        this.email = email;
        this.phone = phone;
    }

    // Setter 대신, 업데이트 기능을 별도로 추가함
    public void pwAndEmailUpdate(String name, char[] pw, String email, String phone){
        this.name = name;
        this.pw = pw;
        this.email = email;
        this.phone = phone;
    }
}
