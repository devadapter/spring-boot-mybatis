package com.devadapter.springbootmybatis.enums;

/**
 * 性别枚举类
 *
 * @author : zhangjie
 * @date : 2019/3/21
 */
public enum UserSexEnum implements BaseEnum {
    /**
     * 男
     */
    MAN(0, "男"),
    /**
     * 女
     */
    WOMAN(1, "女"),
    /**
     * 未知
     */
    UNKNOWN(2, "未知");

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

    UserSexEnum(Integer value, String displayName) {
        this.value = value;
        this.displayName = displayName;
    }
}
