package com.evan.design.prototype;

/**
 * @author evanYang
 * @version 1.0
 * @date 2021/6/7 16:07
 */
public class Client {
    private Prototype prototype;

    public Client(Prototype prototype){
        this.prototype=prototype;
    }
    public Prototype startClone(Prototype con){
        return  (Prototype)con.clone();
    }
}
