package com.devadapter.springbootmybatis.mapper;

import com.devadapter.springbootmybatis.entity.ScoreEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScoreEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ScoreEntity record);

    int insertSelective(ScoreEntity record);

    ScoreEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ScoreEntity record);

    int updateByPrimaryKey(ScoreEntity record);

    int getCountRecord();

    int deleteAll();

    ScoreEntity selectScoreByName(String name);

    List<ScoreEntity> getAll();
}