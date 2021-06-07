package com.evan.design.prototype.depthclone;

/**
 * @author evanYang
 * @version 1.0
 * @date 2021/6/7 17:22
 */
public class DeepCloneTest {
    public static void main(String[] args) {
        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
        try {
            QiTianDaSheng clone = (QiTianDaSheng)qiTianDaSheng.clone();
            System.out.println("深克隆："+(qiTianDaSheng.jinGuBang==clone.jinGuBang));

            QiTianDaSheng q = new QiTianDaSheng();
            QiTianDaSheng n = q.shallowClone(q);
            System.out.println("浅克隆："+(q.jinGuBang==n.jinGuBang));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
