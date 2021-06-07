package com.evan.design.prototype.depthclone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

/**
 * @author evanYang
 * @version 1.0
 * @date 2021/6/7 17:03
 */
public class QiTianDaSheng extends Monkey implements Cloneable, Serializable {
    public JinGuBang jinGuBang;

    public QiTianDaSheng(){
        //初始化
        this.birthday=new Date();
        this.jinGuBang=new JinGuBang();
    }

    @Override
    protected  Object clone() throws CloneNotSupportedException{
        return deepclone();
    }

    public Object deepclone(){
        try {
            ByteArrayOutputStream bos=new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            QiTianDaSheng copy = (QiTianDaSheng)ois.readObject();
            copy.birthday=new Date();
            return copy;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public QiTianDaSheng shallowClone(QiTianDaSheng target){
        QiTianDaSheng daSheng = new QiTianDaSheng();
        daSheng.height=target.height;
        daSheng.weight=target.weight;
        daSheng.jinGuBang=target.jinGuBang;
        daSheng.birthday=new Date();
        return daSheng;
    }
}
