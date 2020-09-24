package com.devadapter.springbootmybatis.mapper;

import com.devadapter.springbootmybatis.entity.UserEntity;
import com.devadapter.springbootmybatis.enums.UserSexEnum;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * @author : zhangjie
 * @date : 2019/3/21
 */
@ExtendWith(SpringExtension.class)
@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    @Order(1)
    public void testInsert() throws Exception {
        userMapper.insertSelective(new UserEntity("aa1", "a123456", UserSexEnum.MAN));
        userMapper.insertSelective(new UserEntity("bb1", "b123456", UserSexEnum.WOMAN));
        userMapper.insertSelective(new UserEntity("cc1", "b123456", UserSexEnum.WOMAN));
        userMapper.insertSelective(new UserEntity("马劳恩", "1weqwes", UserSexEnum.UNKNOWN));
        userMapper.insertSelective(new UserEntity("似懂非懂", "23erdf", UserSexEnum.MAN));
    }

    @Test
    @Order(2)
    public void testQuery() throws Exception {
        List<UserEntity> users = userMapper.getAll();
        assertEquals(5, users.size());
        System.out.println(users);
    }


    @Test
    @Order(3)
    public void testUpdate() throws Exception {
        UserEntity user = userMapper.selectUserByUserName("马劳恩");
        System.out.println(user);
        user.setNickName("neo");
        userMapper.updateByPrimaryKeySelective(user);
        assertEquals("neo", userMapper.getUser(user.getId()).getNickName());
        System.out.println("sex==" + user.getUserSex());
    }

    @Test
    @Order(4)
    public void testDeleteAll() {
        userMapper.deleteAll();
        assertEquals(0, userMapper.getCountRecord());
    }

}