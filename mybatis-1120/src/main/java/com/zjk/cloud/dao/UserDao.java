package com.zjk.cloud.dao;

import com.zjk.cloud.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserDao {
    public int insertUser(User user);
    public int deleteUserById(Long id);
    public int updateByUser(User user);
    public User queryById(Long id);
}
