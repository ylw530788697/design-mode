package com.evan.design.prototype;

import lombok.Data;

import java.util.List;

/**
 * @author evanYang
 * @version 1.0
 * @date 2021/6/7 15:48
 */
@Data
public class ConcretePrototypeA implements Prototype{


    private int age;

    private String name;

    private List hobbies;

    @Override
    public Prototype clone() {
        ConcretePrototypeA concretePrototypeA=new ConcretePrototypeA();
        concretePrototypeA.setAge(this.age);
        concretePrototypeA.setName(this.name);
        concretePrototypeA.setHobbies(this.hobbies);
        return concretePrototypeA;
    }
}
