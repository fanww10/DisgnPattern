package main.java.simpleFactory;

public class Client {
    public static void main(String[] args) {

    }
    public interface Product{
        void show();
    }
    static class Product1 implements Product{

        @Override
        public void show() {

        }
    }
    static class Product2 implements Product{

        @Override
        public void show() {

        }
    }
}
