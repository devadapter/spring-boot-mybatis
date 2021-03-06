package com.devadapter.springbootmybatis.vo;

import java.io.Serializable;
import java.util.StringJoiner;

/**
 * 阿里ip返回Vo
 *
 * @author zhangjie
 * @date : 2019-05-10 10:11
 */
public class Address implements Serializable {
    /**
     * 请求ip
     */
    private String ip;
    /**
     * 国家
     */
    private String country;
    /**
     * area
     */
    private String area;
    /**
     * 省
     */
    private String region;
    /**
     * 城市
     */
    private String city;
    /**
     * 县
     */
    private String county;
    /**
     * 因特网提供商
     */
    private String isp;
    /**
     * 国家id
     */
    private String country_id;
    /**
     * 区域id
     */
    private String area_id;
    /**
     * 省id
     */
    private String region_id;
    /**
     * 城市id
     */
    private String city_id;
    /**
     * 县id
     */
    private String county_id;
    /**
     * 因特网提供商id
     */
    private String isp_id;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getIsp() {
        return isp;
    }

    public void setIsp(String isp) {
        this.isp = isp;
    }

    public String getCountry_id() {
        return country_id;
    }

    public void setCountry_id(String country_id) {
        this.country_id = country_id;
    }

    public String getArea_id() {
        return area_id;
    }

    public void setArea_id(String area_id) {
        this.area_id = area_id;
    }

    public String getRegion_id() {
        return region_id;
    }

    public void setRegion_id(String region_id) {
        this.region_id = region_id;
    }

    public String getCity_id() {
        return city_id;
    }

    public void setCity_id(String city_id) {
        this.city_id = city_id;
    }

    public String getCounty_id() {
        return county_id;
    }

    public void setCounty_id(String county_id) {
        this.county_id = county_id;
    }

    public String getIsp_id() {
        return isp_id;
    }

    public void setIsp_id(String isp_id) {
        this.isp_id = isp_id;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Address.class.getSimpleName() + "[", "]")
                .add("ip='" + ip + "'")
                .add("country='" + country + "'")
                .add("area='" + area + "'")
                .add("region='" + region + "'")
                .add("city='" + city + "'")
                .add("county='" + county + "'")
                .add("isp='" + isp + "'")
                .add("country_id='" + country_id + "'")
                .add("area_id='" + area_id + "'")
                .add("region_id='" + region_id + "'")
                .add("city_id='" + city_id + "'")
                .add("county_id='" + county_id + "'")
                .add("isp_id='" + isp_id + "'")
                .toString();
    }
}