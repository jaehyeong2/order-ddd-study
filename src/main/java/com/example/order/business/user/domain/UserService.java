package com.example.order.business.user.domain;

import com.example.order.business.user.presentation.user.UserDto;

public interface UserService {
    public UserDto.Response find(Long id);
    public Long join(UserDto.Create dto);
    public String update();
    public String delete(Long id);
}
