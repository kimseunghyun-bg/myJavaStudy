package com.kimseunghyun.ejb.entity;

import java.io.Serializable;

/**
 * Created by kimseunghyun on 2017-10-09.
 */


public class FooEJBEntity implements Serializable{
    private static final long serialVersionUID = -5225635423717627390L;

    private String id;
    private String name;
    private String sex;
    private String address;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "FooEJBEntity{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
