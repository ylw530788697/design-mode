package com.evan.design.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @author evanYang
 * @version 1.0
 * @date 2021/6/7 16:11
 */
public class PrototypeTest {
    public static void main(String[] args) {
        ConcretePrototypeA prototypeA = new ConcretePrototypeA();
        prototypeA.setAge(18);
        prototypeA.setName("testPrototype");
        List hobbies=new ArrayList<String>();
        prototypeA.setHobbies(hobbies);
        System.out.println(prototypeA);

        Client client = new Client(prototypeA);
        ConcretePrototypeA clone =(ConcretePrototypeA) client.startClone(prototypeA);

        System.out.println("克隆对象中的引用类型地址值：" + clone.getHobbies());
        System.out.println("原对象中的引用类型地址值：" + prototypeA.getHobbies());
        System.out.println("对象地址比较："+(clone.getHobbies() == prototypeA.getHobbies()));

        System.out.println(prototypeA);
        System.out.println(clone);
        System.out.println(clone==prototypeA);
    }
}
