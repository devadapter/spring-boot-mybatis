package com.devadapter.springbootmybatis.mapper;

import com.devadapter.springbootmybatis.entity.ScoreEntity;
import com.devadapter.springbootmybatis.enums.ScoreClassEnum;
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
public class ScoreMapperTest {

    @Autowired
    private ScoreEntityMapper scoreEntityMapper;

    @Test
    @Order(1)
    public void testInsert() throws Exception {
        scoreEntityMapper.insertSelective(new ScoreEntity("张三", ScoreClassEnum.ENGLISH, 90));
        scoreEntityMapper.insertSelective(new ScoreEntity("李四", ScoreClassEnum.HISTORY, 100));
        scoreEntityMapper.insertSelective(new ScoreEntity("王五", ScoreClassEnum.CHEMISTRY, 87));
        scoreEntityMapper.insertSelective(new ScoreEntity("马六", ScoreClassEnum.MATHEMATICS, 77));
        scoreEntityMapper.insertSelective(new ScoreEntity("赵气", ScoreClassEnum.LANGUAGE, 88));
        assertEquals(5, scoreEntityMapper.getCountRecord());
    }

    @Test
    @Order(2)
    public void testUpdateScore() {
        ScoreEntity scoreEntity = scoreEntityMapper.selectScoreByName("李四");
        System.out.println("className==" + scoreEntity.getClassName());
        scoreEntity.setClassName(ScoreClassEnum.POLITICS);
        scoreEntity.setGrade(88);
        scoreEntityMapper.updateByPrimaryKeySelective(scoreEntity);
        assertEquals(88, scoreEntityMapper.selectByPrimaryKey(scoreEntity.getId()).getGrade());
    }

    @Test
    @Order(3)
    public void testQuery() throws Exception {
        List<ScoreEntity> scoreEntities = scoreEntityMapper.getAll();
        assertEquals(5, scoreEntities.size());
        System.out.println(scoreEntities);
    }

    @Test
    @Order(4)
    public void testDeleteALl() {
        scoreEntityMapper.deleteAll();
        assertEquals(0, scoreEntityMapper.getCountRecord());
    }
}