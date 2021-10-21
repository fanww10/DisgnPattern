package main.java.builder;
//抽象建造者：包含创建产品各个子部件的抽象方法。
public abstract class Builder {
    protected Product product = new Product();
    public abstract void buildPart1();
    public abstract void buildPart2();
    public abstract void buildPart3();
    public Product getResult(){
        return product;
    }

}
