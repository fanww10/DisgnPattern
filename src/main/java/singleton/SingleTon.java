package main.java.singleton;

//懒汉模式,线程安全
public class SingleTon {
    private static SingleTon instance = new SingleTon();
    private SingleTon() {}
    public static synchronized SingleTon getInstance() {
        if (instance == null) {
            return new SingleTon();
        }
        else {
            return instance;
        }
    }
}
