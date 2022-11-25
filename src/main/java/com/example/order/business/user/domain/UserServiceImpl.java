package com.example.order.business.user.domain;


import com.example.order.business.user.infrastructure.UserRepository;
import com.example.order.business.user.presentation.user.UserDto;
import com.example.order.global.util.DbUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public UserDto.Response find(Long id) {
        return new UserDto.Response(DbUtils.findOrThrow(userRepository,id));
    }

    @Override
    public Long join(UserDto.Create dto) {
        User user = User.create(dto);
        userRepository.save(user);
        return user.getId();
    }

    @Override
    public String update() {
        return null;
    }

    @Override
    public String delete(Long id) {
        return null;
    }
}
