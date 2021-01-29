package com.example.demo.service;

import com.example.demo.pojo.User;

import java.util.List;

public interface UserService {

    //查找所有用户的方法,返回一个用户集合
    List<User>  findAllStudent();

    //添加方法
   int addUser(User user);

    //删除方法
    int deleteUser(Integer id);

    //修改方法

    int updateUser(User user);

    //增加了根据id查询用户的方法

    User getUserById(Integer id);

}
