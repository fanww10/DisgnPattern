package main.java.adapter.classadapter;

public class ClassAdapter extends Adaptee implements Target{
    @Override
    public void request() {
        specificRequest();
    }
}
