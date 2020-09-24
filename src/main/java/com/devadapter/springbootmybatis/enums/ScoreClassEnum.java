package com.devadapter.springbootmybatis.enums;

/**
 * 性别枚举类
 *
 * @author : zhangjie
 * @date : 2019/3/21
 */
public enum ScoreClassEnum implements BaseEnum {
    /**
     * 语文
     */
    LANGUAGE(0, "语文"),
    /**
     * 数
     */
    MATHEMATICS(1, "数"),
    /**
     * 英语
     */
    ENGLISH(2, "英语"),
    /**
     * 物理
     */
    PHYSICS(3, "物理"),
    /**
     * 化学
     */
    CHEMISTRY(4, "化学"),
    /**
     * 生物
     */
    ORGANISM(5, "生物"),
    /**
     * 地理
     */
    GEOGRAPHY(6, "地理"),
    /**
     * 历史
     */
    HISTORY(7, "历史"),
    /**
     * 政治
     */
    POLITICS(8, "政治");


    private final Integer value;

    private final String displayName;

    @Override
    public Integer getValue() {
        return value;
    }

    @Override
    public String getDisplayName() {
        return displayName;
    }

    ScoreClassEnum(Integer value, String displayName) {
        this.value = value;
        this.displayName = displayName;
    }
}
