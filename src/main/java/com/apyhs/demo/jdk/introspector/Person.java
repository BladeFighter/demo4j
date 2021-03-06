package com.apyhs.demo.jdk.introspector;

public class Person implements Fly {

    protected static final String DEFAULT_SAY = "Hello, World! ";
    private static final String DEFAULT_TYPE = "Person";

    public String foo = "foo";

    private String name;
    private Integer age;
    private Double height;

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

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    private void iAmPrivate() {
        System.out.println("I am private. ");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}
