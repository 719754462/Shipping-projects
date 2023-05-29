package com.example.active.mysql.pojo;

import org.springframework.data.relational.core.mapping.Table;

@Table("Second")
public class Num {
    private String one;

    //用户名称
    private String two;

    //户年龄
    private String three;

    //用户性别
    private String four;
    private String label;

    public String getOne() {
        return one;
    }

    public void setOne(String name) {
        this.one = name;
    }

    public String getTwo() {
        return two;
    }

    public void setTwo(String sex) {
        this.two = sex;
    }

    public String getThree() {
        return three;
    }

    public void setThree(String birth) {
        this.three = birth;
    }

    public String getFour() {
        return four;
    }

    public void setFour(String birthaddr) {
        this.four = birthaddr;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return one+" "+two+" "+three+" "+four+" "+label;
    }
}
