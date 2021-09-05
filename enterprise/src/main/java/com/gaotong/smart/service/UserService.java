package com.gaotong.smart.service;

import com.gaotong.smart.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author suouyang
 * @since 2021-08-07
 */
public interface UserService extends IService<User> {
    public User login(String username, String password);
}
