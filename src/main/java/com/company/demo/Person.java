package com.company.demo;

import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

public class Person {
   private Integer id ;
   private String name;
   private BigDecimal sal;
   @DateTimeFormat(pattern = "yyyy-MM-dd")
   private Date birthday;
   private  Phone phone;

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                ", phone=" + phone +
                '}';
    }

    public Person(Integer id, String name, BigDecimal sal, Date birthday, Phone phone) {
        this.id = id;
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
        this.phone = phone;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public Person(Integer id, String name, BigDecimal sal, Date birthday) {
        this.id = id;
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public Person() {
    }

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

    public BigDecimal getSal() {
        return sal;
    }

    public void setSal(BigDecimal sal) {
        this.sal = sal;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Person(Integer id) {
        this.id = id;
    }

}
