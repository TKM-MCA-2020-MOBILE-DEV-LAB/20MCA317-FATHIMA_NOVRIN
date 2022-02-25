package com.example.sql;

public class customer {
private int id,age;
private String name;
private Boolean active;

    public customer(int id, int age, String name, Boolean active) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.active = active;
    }

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
    public customer() {
    }

    @Override
    public String toString() {
        return "customer{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", active=" + active +
                '}';
    }
}
