package com.example.order.business.user.presentation.user;


import com.example.order.business.user.domain.Gender;
import com.example.order.business.user.domain.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;


public class UserDto {

    @Data
    public static class Response{
        private String name;
        private String username;
        private String nickName;
        private String phoneNumber;
        private Gender gender;

        public Response(User user) {
            this.name = user.getName();
            this.username = user.getUsername();
            this.nickName = user.getNickName();
            this.phoneNumber = user.getPhoneNumber();
            this.gender = user.getGender();
        }
    }

    @Data
    public static class Create{
        private String name;
        private String username;
        private String nickName;
        private String phoneNumber;
        private Gender gender;
    }
}
