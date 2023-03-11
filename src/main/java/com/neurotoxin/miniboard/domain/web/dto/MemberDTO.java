package com.neurotoxin.miniboard.domain.web.dto;

import com.neurotoxin.miniboard.domain.web.entity.Member;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

// https://tmdrl5779.tistory.com/51 참고

public class MemberDTO {
    @Getter
    @NoArgsConstructor
    public class SaveRequestMemberDto {
        private int id;
        private String name;
        private char[] pw;
        private String email;
        private String phone;

        @Builder
        public SaveRequestMemberDto(int id, String name, char[] pw, String email){
            this.id = id;
            this.name = name;
            this.pw = pw;
            this.email = email;
        }

        // dto -> entity
        public Member toEntity() {
            return toEntity().builder()
                    .name(name)
                    .pw(pw)
                    .email(email)
                    .phone(phone)
                    .build();
        }

    }
    @Getter
    @NoArgsConstructor
    public class ResponseMemberDto {
        private Long id;
        private String name;
        private char[] pw;
        private String email;

        // entity -> dto
        public ResponseMemberDto(Member entity){
            this.id = entity.getId();
            this.name = entity.getName();
            this.pw = entity.getPw();
            this.email = entity.getEmail();
        }
    }

}
