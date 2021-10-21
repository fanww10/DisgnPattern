package main.java.prototype;

public class ProtoTypePattern implements Cloneable{
    ProtoTypePattern(){
        System.out.println("原型创建成功");
    }
    public Object clone() throws CloneNotSupportedException {
        System.out.println("原型复制成功");
        return (ProtoTypePattern)super.clone();
    }
}

