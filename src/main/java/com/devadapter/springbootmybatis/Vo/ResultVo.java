package com.devadapter.springbootmybatis.Vo;


import java.util.StringJoiner;

/**
 * @author : zhangjie
 * @description : 返回结果集
 * @date : 2019-05-10 11:51
 **/
public class ResultVo<T> {

    /**
     * 返回码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 返回分页的总条数
     */
    private Integer total;

    /**
     * 具体的内容
     */
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ResultVo.class.getSimpleName() + "[", "]")
                .add("code=" + code)
                .add("msg='" + msg + "'")
                .add("total=" + total)
                .add("data=" + data)
                .toString();
    }
}
