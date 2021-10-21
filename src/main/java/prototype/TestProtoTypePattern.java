package main.java.prototype;

public class TestProtoTypePattern {
    public static void main(String[] args) throws CloneNotSupportedException {
        ProtoTypePattern obj1 = new ProtoTypePattern();
        ProtoTypePattern obj2 = (ProtoTypePattern) obj1.clone();
        System.out.println("obj1==obj2?" + (obj1 == obj2));
    }
}
