package com.itheima.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.itheima.service.UserService;

/**
 * @author Steven
 * @version 1.0
 * @description com.itheima.service.impl
 * @date 2019-4-8
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String getUserName() {
        return "Steven";
    }
}
