package com.devadapter.springbootmybatis.controller;

import com.devadapter.springbootmybatis.entity.UserEntity;
import com.devadapter.springbootmybatis.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/getUsersTomcat")
    public List<UserEntity> getUsersTomcat() {
        List<UserEntity> users = userMapper.getAll();
        logger.info("----------users:[{}]---------------", users);
        return users;
    }

//    @GetMapping("/getUsersNetty")
//    public Flux<UserEntity> getUsersNetty() {
//        List<UserEntity> users = userMapper.getAll();
//        log.info("----------users:[{}]---------------",users);
//        return Flux.fromIterable(users);
//    }

    @GetMapping("/getUser")
    public UserEntity getUser(Long id) {
        return userMapper.getUser(id);
    }

    @PostMapping("/add")
    public void save(UserEntity user) {
        userMapper.insert(user);
    }

    @PutMapping(value = "update")
    public void update(UserEntity user) {
        userMapper.update(user);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        userMapper.delete(id);
    }

    public static void main(String[] args) {
        List<String> stringList = Stream.of("C", "A", "B").sorted().collect(Collectors.toList());
        stringList.forEach(System.out::println);
    }
}