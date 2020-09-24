package com.devadapter.springbootmybatis.entity;

import java.util.StringJoiner;

/**
 * @author : zhangjie
 * @date : 2019-04-09 15:02
 */
public class WeatherInfoEntity {
    private String city;
    private String temp;
    private String WD;
    private String WS;
    private String SD;
    private String time;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getWD() {
        return WD;
    }

    public void setWD(String WD) {
        this.WD = WD;
    }

    public String getWS() {
        return WS;
    }

    public void setWS(String WS) {
        this.WS = WS;
    }

    public String getSD() {
        return SD;
    }

    public void setSD(String SD) {
        this.SD = SD;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", WeatherInfoEntity.class.getSimpleName() + "[", "]")
                .add("city='" + city + "'")
                .add("temp='" + temp + "'")
                .add("WD='" + WD + "'")
                .add("WS='" + WS + "'")
                .add("SD='" + SD + "'")
                .add("time='" + time + "'")
                .toString();
    }
}
