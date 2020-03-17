package com.lvtu.domain;

/**
 * ClassName:NewFaceUser
 * Package:com.lvtu.domain
 * Description:TODO
 *
 * @Date:2020/3/2 0002 0:15
 * Author:2498897200@qq.com
 */
public class NewFaceUser {
    private Integer id;
    private String name;
    private Integer age;
    private Integer gender;
    private Double birthday;
    private String passworld;
    private String tel;

    @Override
    public String toString() {
        return "NewFaceUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", birthday=" + birthday +
                ", passworld='" + passworld + '\'' +
                ", tel='" + tel + '\'' +
                ", uid=" + uid +
                '}';
    }

    private Integer uid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getGerder() {
        return gender;
    }

    public void setGerder(Integer gerder) {
        this.gender = gerder;
    }

    public Double getBirthday() {
        return birthday;
    }

    public void setBirthday(double birthday) {
        this.birthday = birthday;
    }

    public String getPassworld() {
        return passworld;
    }

    public void setPassworld(String passworld) {
        this.passworld = passworld;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}
