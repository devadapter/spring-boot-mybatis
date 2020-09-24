package com.devadapter.springbootmybatis.entity;

import com.devadapter.springbootmybatis.enums.ScoreClassEnum;

import java.util.StringJoiner;

public class ScoreEntity {
    private Long id;

    private String name;

    private ScoreClassEnum className;

    private Integer grade;

    public ScoreEntity() {
    }

    public ScoreEntity(String name, ScoreClassEnum className, Integer grade) {
        this.name = name;
        this.className = className;
        this.grade = grade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ScoreClassEnum getClassName() {
        return className;
    }

    public void setClassName(ScoreClassEnum className) {
        this.className = className;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ScoreEntity.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("name='" + name + "'")
                .add("className=" + className)
                .add("grade=" + grade)
                .toString();
    }
}