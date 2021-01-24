package com.eznotez.demo01security.service.impl;

import com.eznotez.demo01security.entity.User;
import com.eznotez.demo01security.repository.UserRepository;
import com.eznotez.demo01security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("用户名不存在");
        }
        return null;
    }
}
