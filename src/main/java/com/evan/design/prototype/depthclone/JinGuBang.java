package com.evan.design.prototype.depthclone;

import java.io.Serializable;

/**
 * @author evanYang
 * @version 1.0
 * @date 2021/6/7 17:01
 */
public class JinGuBang implements Serializable {

    public float h=100;
    public float d=10;

    public void big(){
        this.d *=2;
        this.h *=2;
    }

    public void small(){
        this.d /=2;
        this.h /=2;
    }
}
