package com.devadapter.springbootmybatis.Vo;

import java.util.StringJoiner;

/**
 * @author : zhangjie
 * @date : 2019-05-16 11;35
 */
public class WeatherInfo {
    private String AP;
    private String Radar;
    private String SD;
    private String WD;
    private String WS;
    private String WSE;
    private String city;
    private String cityid;
    private String isRadar;
    private String njd;
    private String sm;
    private String temp;
    private String time;

    public String getAP() {
        return AP;
    }

    public void setAP(String AP) {
        this.AP = AP;
    }

    public String getRadar() {
        return Radar;
    }

    public void setRadar(String radar) {
        Radar = radar;
    }

    public String getSD() {
        return SD;
    }

    public void setSD(String SD) {
        this.SD = SD;
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

    public String getWSE() {
        return WSE;
    }

    public void setWSE(String WSE) {
        this.WSE = WSE;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCityid() {
        return cityid;
    }

    public void setCityid(String cityid) {
        this.cityid = cityid;
    }

    public String getIsRadar() {
        return isRadar;
    }

    public void setIsRadar(String isRadar) {
        this.isRadar = isRadar;
    }

    public String getNjd() {
        return njd;
    }

    public void setNjd(String njd) {
        this.njd = njd;
    }

    public String getSm() {
        return sm;
    }

    public void setSm(String sm) {
        this.sm = sm;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", WeatherInfo.class.getSimpleName() + "[", "]")
                .add("AP='" + AP + "'")
                .add("Radar='" + Radar + "'")
                .add("SD='" + SD + "'")
                .add("WD='" + WD + "'")
                .add("WS='" + WS + "'")
                .add("WSE='" + WSE + "'")
                .add("city='" + city + "'")
                .add("cityid='" + cityid + "'")
                .add("isRadar='" + isRadar + "'")
                .add("njd='" + njd + "'")
                .add("sm='" + sm + "'")
                .add("temp='" + temp + "'")
                .add("time='" + time + "'")
                .toString();
    }
}
