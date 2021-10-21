package main.java.flyweight;

import java.util.HashMap;

/**
 * @author create by wwfan2
 * @data 2021/1/5 17:52
 * @description 享元模式
 */

public class FlyWeightTest {
    public static void main(String[] args) {

    }
}
//非享元对象
class UnsharedConcreteFlyweight {
    private String info;
    UnsharedConcreteFlyweight(String info) {
        this.info = info;
    }
    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }
}

interface FlyWeight{
    public void operation(UnsharedConcreteFlyweight state);
}
//享元对象
class ConcreteFlyweight implements FlyWeight{
    private String key;

    public ConcreteFlyweight(String key) {
        this.key = key;
        System.out.println("具体享元" + key + "被创建！");
    }

    @Override
    public void operation(UnsharedConcreteFlyweight outState) {
        System.out.print("具体享元" + key + "被调用，");
        System.out.println("非享元信息是:" + outState.getInfo());
    }
}
//享元工厂对象
class FlyweightFactory{
    private HashMap<String, FlyWeight> flyweights = new HashMap<String, FlyWeight>();
    public FlyWeight getFlyweight(String key){
        FlyWeight flyweight = (FlyWeight) flyweights.get(key);
        if (flyweight != null) {
            System.out.println("具体享元" + key + "已经存在，被成功获取！");
        } else {
            flyweight = new ConcreteFlyweight(key);
            flyweights.put(key, flyweight);
        }
        return flyweight;
    }

}
