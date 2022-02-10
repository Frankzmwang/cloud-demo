package cn.itcast.user.service;

import cn.itcast.user.mapper.UserMapper;
import cn.itcast.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Value("${server.port}")
    int port;

    public User queryById(Long id) {
        User byId = userMapper.findById(id);
        byId.setAddress(port+"");
        return byId;
    }
}