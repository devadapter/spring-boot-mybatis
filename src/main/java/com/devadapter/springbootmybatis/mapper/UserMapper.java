package com.devadapter.springbootmybatis.mapper;

import com.devadapter.springbootmybatis.entity.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author : zhangjie
 * @date : 2019/3/21
 */
@Repository
public interface UserMapper {
    List<UserEntity> getAll();

    UserEntity getUser(Long id);

    void update(UserEntity userEntity);

    void delete(Long id);

    int deleteByPrimaryKey(Long id);

    int insert(UserEntity record);

    int insertSelective(UserEntity record);

    UserEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserEntity record);

    int updateByPrimaryKey(UserEntity record);

    int deleteAll();

    UserEntity selectUserByUserName(String userName);

    int getCountRecord();
}
