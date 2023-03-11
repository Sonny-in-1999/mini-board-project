package com.neurotoxin.miniboard.domain.user.entity;

// @Entity
public class Member {

    // userID
    private Long id;
    // userPassword
    private char[] pw;
    // userNickname
    private String name;
    // userEmail
    private String email;

    public Member(Long id, char[] pw, String name, String email) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public char[] getPw() {
        return pw;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
