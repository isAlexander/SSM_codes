package com.ch09;

public class Person {
    private Integer id;
    private String name;
    private Integer age;
    private String sex;
    private Card card;  //个人关联的证件
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
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public Card getCard() {
        return card;
    }
    public void setCard(Card card) {
        this.card = card;
    }
    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", "
                + "age=" + age + ", sex=" + sex ;
    }

}

