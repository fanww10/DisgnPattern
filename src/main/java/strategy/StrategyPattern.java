package main.java.strategy;

public class StrategyPattern {
    public static void main(String[] args) {
        Context c = new Context();
        Strategy s = new ConcreteStrategyA();
        c.setStrategy(s);
        c.strategyMethod();
//        s.strategyMethod();
        s = new ConcreteStrategyB();
        c.setStrategy(s);
        c.strategyMethod();
//        s.strategyMethod();
    }
}
interface Strategy{
    public void strategyMethod();
}
class ConcreteStrategyA implements Strategy{

    @Override
    public void strategyMethod() {
        System.out.println("具体策略A的策略方法被访问！");
    }
}
class ConcreteStrategyB implements Strategy{

    @Override
    public void strategyMethod() {
        System.out.println("具体策略B的策略方法被访问！");
    }
}
class Context{

    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    public void strategyMethod(){
        strategy.strategyMethod();
    }


}
