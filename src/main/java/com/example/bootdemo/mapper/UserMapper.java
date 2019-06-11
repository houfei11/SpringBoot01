package com.example.bootdemo.mapper;

import com.example.bootdemo.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {

    /**
     * 查询
     * @param name
     * @return
     */
    List<User> findUserByName(String name);

    /**
     * 查询所有
     * @return
     */
    List<User> listUser();

    /**
     * 添加
     * @param user
     * @return
     */
    User insertUser(User user);

    /**
     * 删除
     * @param id
     */
    int deleteUser(int id);

    /**
     * 修改
     * @param user
     */
    int updateUser(User user);
}
