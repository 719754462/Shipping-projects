package com.example.active.mysql.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("mytable")
public class User {
    @Id
    //用户id
    private String name;

    //用户名称
    private String sex;

    //户年龄
    private String birth;

    //用户性别
    private String birthaddr;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.name = sex;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getBirthaddr() {
        return birthaddr;
    }

    public void setBirthaddr(String birthaddr) {
        this.birthaddr = birthaddr;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", birth='" + birth + '\'' +
                ", birthaddr='" + birthaddr + '\'' +
                '}';
    }
}
