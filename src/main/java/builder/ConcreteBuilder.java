package main.java.builder;
//具体建造者：实现了抽象建造者接口。
public class ConcreteBuilder extends Builder{
    @Override
    public void buildPart1() {
        product.setPart1("建造对象1\n");
    }

    @Override
    public void buildPart2() {
        product.setPart2("建造对象2\n");
    }

    @Override
    public void buildPart3() {
        product.setPart3("建造对象3\n");
    }
}
