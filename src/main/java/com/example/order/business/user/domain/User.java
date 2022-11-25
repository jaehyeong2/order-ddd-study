package com.example.order.business.user.domain;

import com.example.order.business.user.presentation.user.UserDto;
import com.example.order.global.entity.BaseEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class User extends BaseEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String username;
    private String nickName;

    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Builder
    public User(String name, String username, String nickName, String phoneNumber, Gender gender) {
        this.name = name;
        this.username = username;
        this.nickName = nickName;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public static User create(UserDto.Create dto){
        return builder()
                .name(dto.getName())
                .nickName(dto.getNickName())
                .phoneNumber(dto.getPhoneNumber())
                .username(dto.getUsername())
                .gender(dto.getGender())
                .build();

    }

}
