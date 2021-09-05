package com.gaotong.smart.service.impl;

import com.gaotong.smart.entity.User;
import com.gaotong.smart.mapper.UserMapper;
import com.gaotong.smart.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author suouyang
 * @since 2021-08-07
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
  @Autowired
  UserMapper userMapper;
    @Override
    public User login(String username, String password) {
       return  userMapper.login(username, password);

    }
}
